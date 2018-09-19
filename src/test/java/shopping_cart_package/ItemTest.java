package shopping_cart_package;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {
	@Test
	public void shouldGetTotalForItemWithSomeQuantity() {
		Item underTest = new Item("sequin oven mitts", 4.00, 25);
		double total = underTest.getTotal();
		
		assertEquals(100, total, 0.005);
	}
	
	@Test
	public void shouldGetTotalForAnotherItemWithSomeQuantity() {
		Item underTest = new Item("cheaper oven mitts", 1.00, 25);
		double total = underTest.getTotal();
		
		assertEquals(25, total, 0.005);
	}
	
	@Test
	public void shouldPrintAReasonableStringRepresentation() {
		Item underTest = new Item("Sweater for a Piano", 40.00);
		String itemAsString = underTest.toString();
		String expectedString = "Sweater for a Piano, Price: 40.0, Qty: 0";
		
		assertEquals("should be a string representation for the user", expectedString, itemAsString);
	}
	
	@Test
	public void shouldPrintAReasonableStringRepresentationAllOverAgain() {
		Item underTest = new Item("Cat Tractor", 10000.00);
		String itemAsString = underTest.toString();
		String expectedString = "Cat Tractor, Price: 10000.0, Qty: 0";
		
		assertEquals("should be a string representation for the user", expectedString, itemAsString);
	}
}
