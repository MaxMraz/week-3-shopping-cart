package shopping_cart_package;

public class Item {
	public String name;
	public double price;
	public int quantity;
	
	//Constructor
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Constructor OVERLOAD!!!!!!AHHHHHHHHHHH!!!!!!
	public Item(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getTotal() {
		return (quantity * price);
	}
	
	@Override
	public String toString() {
		return "" + name + ", Price: " + price + ", Qty: " + quantity;
	}
}
