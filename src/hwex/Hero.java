package hwex;


public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	private IAttackBehavior attack;
	private IMoveBehavior move;
	private IDefendBehavior defend;
	
	public void setAttack(IAttackBehavior attack) {
		this.attack=attack;
	}
	public void setMove(IMoveBehavior move) {
		this.move=move;
	}
	public void setDefend(IDefendBehavior defend) {
		this.defend=defend;
	}
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void attack() {
		attack.attack();
	}
	
	public void move() {
		move.move();
	};
	
	public void defend() {
		defend.defend();
	};
}
