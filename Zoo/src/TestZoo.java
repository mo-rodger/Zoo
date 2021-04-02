import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestZoo{

	Zoo zoo;
	
	@BeforeEach
	void setUp() throws Exception {
		zoo = new Zoo("Molly's zoo");
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void getAnimal() {
		System.out.println("Running getAnimal test...");
		assertEquals(zoo.getName(), "Molly's zoo");
		Animal animal = zoo.getAnimal("Lizzie");
		assertEquals(animal.getName(), "Lizzie");
		System.out.println(animal.toString());
		System.out.println("... end test getAnimal \n");
	}
	
	@Test
	void getMissingAnimal() {
		Animal animal = zoo.getAnimal("freddie");
		assertNull(animal);
	}
	
	@Test
	void getAnimals() {
		System.out.println("Running getAnimals test...");
		ArrayList<Animal> animals = zoo.getAnimals();
		assertEquals(animals.size(), 4);
		// Print out Animals in Zoo
		System.out.println("Animals in Zoo");
		System.out.println(animals.toString());
		System.out.println("... end test getAnimals \n");
		
	}	
		
	@Test
	void getReptiles() {
		System.out.println("Running getReptiles test...");
		ArrayList<Animal> animals = zoo.getAnimals(Reptile.class);
		assertEquals(animals.size(), 1);
		
		// Print out reptiles in Zoo
		System.out.println("Reptiles in Zoo");
		System.out.println(animals.toString());
		System.out.println("... end test getReptiles");
	}
	
	@Test
	void getMammal() {
		System.out.println("Running getMammal test...");
		ArrayList<Animal> animals = zoo.getAnimals(Mammal.class);
		assertEquals(animals.size(), 1);
		
		// Print out reptiles in Zoo
		System.out.println("Mammals in Zoo");
		System.out.println(animals.toString());
		System.out.print("... end test getMammal \n");
		}	
	
	@Test
	void getFoodForAllAnimals() {
		System.out.println("Running getFoodForAllAnimals...");
		ArrayList<Animal> animals = zoo.getAnimals();
		ArrayList<String> food = zoo.getFoodRequirements(animals);
		System.out.println(food.toString());
		System.out.println("... end test getFoodForAllAnimals\n");
	}
 
	@Test
	void getFoodForType() {
		System.out.println("\n Running getFoodForType Reptile ...");
		ArrayList<Animal> animals = zoo.getAnimals(Reptile.class);	
		ArrayList<String> food = zoo.getFoodRequirements(animals);
		System.out.println(food.toString());
		
		System.out.println("\n Running getFoodForType Bird ...");
		animals = zoo.getAnimals(Bird.class);	
		food = zoo.getFoodRequirements(animals);
		System.out.println(food.toString());
		System.out.println("... end test getFoodForType");
	}
	
	@Test 
	void getAnimalByEnvironment() {
		System.out.println("Running getAnimalByEnvironment...");
		System.out.println("Animals fronm the Ocean");
		ArrayList<Animal> animalsInEnvironment = zoo.getAnimalByEnvironment("Ocean");
		assertEquals(animalsInEnvironment.size(), 2);
		System.out.println(animalsInEnvironment.toString());
		System.out.println("... end test getAnimalByEnvironment\n");
		
		
	}
	
}

