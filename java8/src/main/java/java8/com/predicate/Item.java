package java8.com.predicate;

public class Item {

	public String color;
	public int price;
	
	public Item(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Item [color=" + color + ", price=" + price + "]";
	}
	
	
}
