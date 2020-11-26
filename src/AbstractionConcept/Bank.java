package AbstractionConcept;

public abstract class Bank { 
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	

	/*Partial Abstraction 
	 * Abstraction : hiding implementation logic
	 * can have both abstract and non abstract methods
	 * can not create object of abstract classes and interface
	 */
	
	public abstract void loan(); // abstract method > only method declaration no method body
	
	
	public void credit(){
		System.out.println(" Bank --- Credit");
	}
	
	public void debit(){
		System.out.println("Bnak  --- Debit");
	}

}
