package hwex;

public class Duck implements IDefendBehavior{
	@Override
	public void defend() {
		System.out.println("閃避");
	}
}
