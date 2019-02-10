
public class EquipmentTest {

	public void constructorTest() throws AssertException {
		Equipment paulItem = new Equipment("PaulItem/3, 3.0, 50.0, Paul's legendary item");
		
		Assert.assertEquals("PaulItem", paulItem.getName());
		Assert.assertEquals(3, paulItem.getCount());
		Assert.assertEquals(3.0, paulItem.getTotalWeight());
		Assert.assertEquals(50.0, paulItem.getTotalPrice());
		Assert.assertEquals(" Paul's legendary item", paulItem.getDescription());
	}

	public void toStringTest() throws AssertException {
		Equipment paulItem = new Equipment("PaulItem/3, 3.0, 50.0, Paul's legendary Item");
		Assert.assertEquals("Name: PaulItem, Number: 3, Weight: 3.00 lbs, Price: $50.00 -  Paul's legendary Item", paulItem.toString());
	}
	
	public void equalsTest() throws AssertException {
		Equipment i1 = new Equipment("i1/10, 5.0, 100.0, Item 1");
		Equipment i1Similar = new Equipment("i1/10, 5.0, 100.0, Item 1");
		Equipment i1Similar2 = new Equipment("i1/10, 5.0, 100.0, Item 1234");
		Equipment i2 = new Equipment("i2/25, 80.0, 10000.00, Item 2");
		Object blank = new Object();
		
		
		Assert.assertEquals(true, i1.equals(i1));
		Assert.assertEquals(false, i1.equals(i2));
		Assert.assertEquals(false, i1.equals(i1Similar2));
		Assert.assertEquals(false, i1.equals(blank));
		Assert.assertEquals(true, i1Similar.equals(i1));


		
	}
}
