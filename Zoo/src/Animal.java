public abstract class Animal {
	protected String name;
	protected String type;
	protected String eats;
	protected String environment;
	
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public String getName() {
		return name;
	}


	/**
	 * @return
	 */
	public String getEats() {
		return eats;
	}

	/**
	 * @return
	 */
	public String getEnvironment() {
		return environment;
		
	}
	
    /**
     *
     */
    @Override
	public String toString() {
		 return "Name: " + name + ", Type: " + this.getClass().getSimpleName() + ", Eats: " + eats + ", Environment: " + environment;

	}	
	

}
 