/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    public void constructorTest() throws AssertException {
    	Animal paul = new Animal("Red", "Paul", 150.0, 60.0);
    	Animal paul2 = new Animal("Red", "Paul", 150.0, 60.0);
    	Animal paul3 = new Animal("Blue", "Paul2", 324.0, 100.0);
    	Object objectivePaul = new Object();
    	Animal boringPaul = new Animal();
    	
    	Assert.assertEquals("Red", paul.getColor());
    	Assert.assertEquals("Paul", paul.getName());
    	Assert.assertEquals(150.0, paul.getWeight());
    	Assert.assertEquals(60.0, paul.getHeight());
    	
    	Assert.assertEquals("Paul, a Red-colored animal. 150.0 pounds, 60.0 inches\n", paul.toString());
    	
    	Assert.assertEquals(true, paul.equals(paul));
    	Assert.assertEquals(true, paul.equals(paul2));
    	Assert.assertEquals(false, paul.equals(paul3));
    	Assert.assertEquals(false, paul.equals(objectivePaul));
    	Assert.assertEquals(false, boringPaul.equals(objectivePaul));
    }
}

