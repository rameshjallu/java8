package java8.com.asynchvsparallel;

public class Item {

	public String name;
	int price;
	String type;
	
	
	
	public Item(String name, int price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	
	
	
}
