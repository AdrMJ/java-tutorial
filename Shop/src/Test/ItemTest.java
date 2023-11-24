package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import Shop.Item;

public class ItemTest {
	
	private Item orange;
	private Item orange2;
	private Item apple;

	@Before
	public void setUp() {
		orange = new Item("orange", 2.33);
		orange2 = new Item("orange", 2.32);
		apple = new Item("apple", 2.33);

	}
	@Test
	public void twoItemsWithSamePriceAndNameShouldBeEquals() {
		assertEquals(orange, orange);
	}
	
	@Test
	public void twoItemsWithSamePriceAndDifferentNamesShouldntBeEquals() {
		assertNotEquals(apple, orange);
	}
	
	@Test
	public void twoItemsWithSameNamesAndOtherPriceShouldntBeEquals() throws Exception {
		assertNotEquals(orange, orange2);
	}
	
	@Test
	public void itemsWithTheSameNameShouldHaveTheSameHashCode() {
		assertEquals(orange.hashCode(), orange2.hashCode());
	}
	
	@Test
	public void itemsWithDifferentNameShouldntHaveTheSameHashCode() {
		assertNotEquals(orange.hashCode(), apple.hashCode());
	}
	@Test
	public void itemsWithDifferentPiceAndTheSameNameShouldBeOrdered() {
		assertEquals(-1, orange2.compareTo(orange));
	}
}
