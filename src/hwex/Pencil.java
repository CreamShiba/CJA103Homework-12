package hwex;

public class Pencil extends Pen {
	
	public Pencil(int price, String brand) {
		super(price,brand);
	}
	
	public void write() {
		System.out.println("先削鉛筆再寫");
	}
	@Override
	public int getPrice() {
		return (int)(super.getPrice()*0.8);
	};
}
