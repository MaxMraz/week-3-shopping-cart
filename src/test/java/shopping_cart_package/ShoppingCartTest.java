package shopping_cart_package;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void shouldAddItem() {
		ShoppingCart underTest = new ShoppingCart();

		Item itemToAdd = new Item("", 1);
		underTest.addItem(itemToAdd);

		Assert.assertEquals("should have added item", true, underTest.containsItem(itemToAdd));
	}

	@Test
	public void shouldRemoveItem() {
		ShoppingCart underTest = new ShoppingCart();

		Item item1 = new Item("", 11);
		underTest.addItem(item1);
		underTest.removeItem(item1);

		assertEquals("should have removed item", true, underTest.isEmpty());
	}

	@Test
	public void shouldBeEmptyWhenCreated() {
		ShoppingCart underTest = new ShoppingCart();

		boolean empty = underTest.isEmpty();

		assertEquals("a new cart should be empty", true, empty);
	}

	@Test
	public void shouldNotBeEmptyWhenFilled() {
		ShoppingCart underTest = new ShoppingCart();

		underTest.addItem(new Item("", 4));
		boolean empty = underTest.isEmpty();

		assertEquals("a new cart should be empty", false, empty);
	}

	@Test
	public void anItemShouldHaveAPrice() {
		double price = 10.50;
		Item underTest = new Item("Slippers", price);

		Assert.assertEquals(price, underTest.price, 0.005);
	}

	@Test
	public void anItemofUnspecifiedQuantityShouldHaveAQuantityOfZero() {
		Item underTest = new Item("vague snacks", 10000000);

		Assert.assertEquals("Shouldn't have a quantity", 0, underTest.quantity);
	}

	@Test
	public void anItemWithAQuantityShouldHaveThatQuantity() {
		int quantity = 6;
		Item underTest = new Item("kangaroo flavored triscuits", .5, quantity);

		Assert.assertEquals("Shouldn't have a quantity", quantity, underTest.quantity);
	}

	@Test
	public void shouldAddTwoItems() {
		ShoppingCart underTest = new ShoppingCart();

		Item item1 = new Item("Shoelaces for Fish", 10);
		Item item2 = new Item("tttttttt", 100);
		underTest.addItem(item1);
		underTest.addItem(item2);

		boolean hasBothItems = (underTest.containsItem(item1) && underTest.containsItem(item2));

		assertEquals("when adding two items, both should be in cart", true, hasBothItems);
	}
	
	@Test
	public void shouldReturnTotalForTwoItemsEachOfAQuantity() {
		ShoppingCart underTest = new ShoppingCart();
		Item item1 = new Item("shark feet", 5.00, 3);
		Item item2 = new Item("socket pretzels", 3.00, 5);
		underTest.addItem(item1);
		underTest.addItem(item2);
		double total = item1.getTotal() + item2.getTotal();
		assertEquals(total, underTest.getTotal(), 0.005);
	}
	
	@Test
	public void shouldReturnTotalForItemOfAQuantity() {
		ShoppingCart underTest = new ShoppingCart();
		Item item1 = new Item("shark feet", 5.00, 3);
		underTest.addItem(item1);
		double total = item1.getTotal();
		assertEquals(total, underTest.getTotal(), 0.005);
	}
}