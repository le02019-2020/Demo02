package JavaBasics;

public class B extends A{
	
	public B(){
		
		super(10, 20);  
		// super kws used to call parent class constructor
		// should be in first statement . 
		// should be in child class
		System.out.println("child cont");
	}

	
	public static void main(String args[]){
		
		B obj = new B();
	
	
	}
		
	
}
