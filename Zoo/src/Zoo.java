import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author mo
 *
 */
public class Zoo {
	
	ArrayList<Animal> hasAnimals = new ArrayList<Animal>();
	private String name;
	

	/**
	 * @param name
	 */
	public Zoo(String name) {
		
		this.name = name;
		hasAnimals.add(new Lizard("Lizzie"));
		hasAnimals.add(new Seal("Sally"));
		hasAnimals.add(new Kiwi("Keith"));
		hasAnimals.add(new Cod("Catherine"));
	}


	/**
	 * @param name
	 * @return
	 */
	public Animal getAnimal(String name) {
		Animal animal = null;
		Iterator <Animal> iterator = hasAnimals.iterator();
		while (iterator.hasNext()) {
			Animal nextAnimal = (Animal)iterator.next();
			if (nextAnimal.getName().equals(name)) {
				animal = nextAnimal;
				break;
			}
		}			
		return animal;
	}
	
	
	/**
	 * @return
	 */
	public String getName() {
		return this.name;
	}


	/**
	 * @return
	 */
	public ArrayList<Animal> getAnimals() {
		return hasAnimals;
	}
	
	/**
	 * @param animalType
	 * @return
	 */
	public ArrayList<Animal> getAnimals(Class<?> animalType) {
		ArrayList<Animal> animals = new ArrayList <Animal> ();
		
		Iterator <Animal> iterator = hasAnimals.iterator();
		while (iterator.hasNext()) {
			Animal nextAnimal = (Animal)iterator.next();
			if (animalType.isInstance(nextAnimal)) {
				animals.add(nextAnimal);
			}
		}			
		
		return animals;
	
	}
	
	/**
	 * @param animals
	 * @return
	 */
	public ArrayList<String> getFoodRequirements(ArrayList<Animal> animals) { 
		ArrayList<String> food = new ArrayList<String>();
		
		Iterator <Animal> iterator = animals.iterator();
		while (iterator.hasNext()) {
			Animal animal = (Animal)iterator.next();
			food.add(animal.getEats());
			
		}
		return food;
	}
	
	public ArrayList<Animal> getAnimalByEnvironment(String environment) {
		ArrayList<Animal> animalsInEnvironment = new ArrayList<Animal>();

		Iterator<Animal> iterator = this.hasAnimals.iterator();
		while (iterator.hasNext()) {
			Animal animal = (Animal) iterator.next();
			if (animal.getEnvironment().equals(environment)) {
				animalsInEnvironment.add(animal);
			}
		}
		return animalsInEnvironment;
	}
}
