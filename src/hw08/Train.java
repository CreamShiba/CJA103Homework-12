package hw08;

import java.util.Objects;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
//==========================================覆寫================================================
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number &&
                Double.compare(train.price, price) == 0 &&
                Objects.equals(type, train.type) &&
                Objects.equals(start, train.start) &&
                Objects.equals(dest, train.dest);
    }
	
	@Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }
	
	@Override
    public int compareTo(Train other) {
        // 寫法：(對方的班次 - 自己的班次) 即為降冪排序
        return Integer.compare(other.number, this.number);
    }
	
	@Override
    public String toString() {
        return "Train [" + number + ", " + type + ", " + start + " -> " + dest + ", 票價=" + price + "]";
    }
//==================================================================
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


}
