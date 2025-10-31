package hw05;

public class PolyTest {
	public static void main(String[] args) {
		Pen [] test = new Pen[2];
		test[0]=new Pencil(100,"SP");
		test[1]=new InkBrush(100,"IB");
		for (int i = 0; i < test.length; i++) {
			test[i].write();
			System.out.println(test[i].getPrice());
			System.out.println("=================");
		}
	}
}
