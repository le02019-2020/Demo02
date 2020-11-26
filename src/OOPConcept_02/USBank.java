package OOPConcept_02;

public interface USBank {  // no method body
	
	
	/*
	 * Characteristics of  Interface:
	 * only Method Body > Method Prototype
	 * only Method Declaration
	 * No Static Method
	 * No Main Method
	 * No Object > Abstract in nature > can not create Object on interface
	 * Can declare variables >> variables are static by nature
	 * Variable values are static >> values can not be changed 
	 * variables are final/constant in nature
	 *  
	 */
	
	
	int min_bal = 100;  // static and final in nature
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	

}
