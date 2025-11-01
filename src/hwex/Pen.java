package hwex;

public abstract class Pen {
	private int price;
	private String brand;
	public Pen() {
	};
	public Pen(int price, String brand) {
		this.price = price;
		this.brand = brand;
	}
	public abstract void write();
	
	public int getPrice() {
		return price;
	};
	public void setPrice(int price) {
		this.price = price;
	};
	public String getBrand() {
		return brand;
	};
	public void setBrand(String brand) {
		this.brand = brand;
	};
}
