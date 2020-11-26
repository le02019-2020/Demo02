package OOPConcept_02;

public class BMW extends Car{  // has a relationship 
	
	
	// Method Overriding > same method name with same parameter is present in both Parent and Child Class
	
	public void start(){ // over ridden method
		System.out.println("BMW Start");
	}
	
	public void safety(){
		System.out.println("BMW Safety");
	}
	
	

}
