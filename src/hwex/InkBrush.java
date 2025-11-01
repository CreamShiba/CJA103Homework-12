package hwex;

public class InkBrush extends Pen {
	
	public InkBrush(int price, String brand) {
		super(price,brand);
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	@Override
	public int getPrice() {
		return (int)(super.getPrice()*0.9);
	};
}
