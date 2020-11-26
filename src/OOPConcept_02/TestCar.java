package OOPConcept_02;

public class TestCar {

	public static void main(String[] args) {
		
		// Polymorphism > Having many forms.  The condition of occurring in several different forms. One to Many
		// Static Or Compile-Time Polymorphism 
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.safety();
		b.engine();
		
		System.out.println("+++++++");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("+++++++");
		
		// Top Casting
		// Dynamic or RunTime Poymorphism
		// Only common and Parent class method can access RunTime 
		Car c1 = new BMW(); // Child Class Object can be referred by Parent Class reference variables. 
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();

		// Down Casting 
		BMW b1 = (BMW) new Car(); // Casting (BMW) >> ClassCastException -- Run Time Exception 
	}

}
