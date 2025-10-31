package hw05;


public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.setAttack(new SwordAttack());
		saber.setMove(new Walk());
		saber.setDefend(new ShieldDefend());
		saber.attack();
		saber.move();
		saber.defend();
		System.out.println("====================");
		archer.setAttack(new ShootingAttack());
		archer.setMove(new Run());
		archer.setDefend(new Duck());
		archer.attack();
		archer.move();
		archer.defend();
	}

}
