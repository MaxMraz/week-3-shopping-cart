package shopping_cart_package;

import java.util.ArrayList;

public class ShoppingCart {

	public ArrayList<Item> contents = new ArrayList<Item>();

	public boolean isEmpty() {
		return contents.isEmpty();
	}

	public boolean containsItem(Item item) {
		if (contents.contains(item)) {
			return true;
		} else {
			return false;
		}
	}

	public void addItem(Item item) {
		this.contents.add(item);
	}

	public void removeItem(Item item) {
		this.contents.remove(item);
	}

	public double getTotal() {
		double total = 0;
		for (Item currentItem: contents) {
			total += currentItem.getTotal();
		}
		return total;
	}

}
