import java.util.Arrays;

public class ZooTest {


	public void mainTest() throws AssertException {
		Zoo zoo1 = new Zoo(2);
		
		Assert.assertEquals(0, zoo1.getAverageWeight());
		Assert.assertEquals(0, zoo1.getAverageWeight("Red"));
		
		Animal paul = new Animal("Red", "Paul", 100.0, 60.0);
		Animal luap = new Animal("Blue", "Luap", 50.0, 30.0);
		Animal alpu = new Animal("Red", "Alpu", 150.0, 90.0);
		
		zoo1.addAnimal(paul);
		zoo1.addAnimal(luap);
		
		Assert.assertEquals(2, zoo1.getCapacity());
		zoo1.addAnimal(alpu);
		Assert.assertEquals(100, zoo1.getAverageWeight());
		Assert.assertEquals(125, zoo1.getAverageWeight("Red"));
		Assert.assertEquals(4, zoo1.getCapacity());
		Assert.assertEquals(180.0, zoo1.getTotalHeight());
		//tpstring, getanimals
	}
	 

	public void toStringTest() throws AssertException {
		Zoo zoo2 = new Zoo(1);
		Animal paul = new Animal("Red", "Paul", 100.0, 60.0);
		zoo2.addAnimal(paul);
		Assert.assertEquals("These animals live in the zoo: \nPaul, a Red-colored animal. 100.0 pounds, 60.0 inches\n" , zoo2.toString());	
		
	}
	
	public void getAnimalsTest() throws AssertException {
		Zoo zoo3 = new Zoo(1);
		Animal paul50 = new Animal("Red", "Paul", 100.0, 60.0);
		Animal[] testArray = new Animal[1];
		testArray[0] = paul50;
		zoo3.addAnimal(paul50);
		Assert.assertEquals(true , Arrays.equals(testArray, zoo3.getAnimals()));
		
	}
	
	

}
