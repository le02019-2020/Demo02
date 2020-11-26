package AbstractionConcept;

public interface Car {
	
	// only final and static variable 
	
	 int wheels =4;
	 
	/*
	 * interface always define only abstract methods
	 * no method body
	 * only method declaration
	 * 100% abstraction
	 * no object in interface
	 * 	 
	*/
	
	public void start();
	public void stop();
	public void refuel();

}
