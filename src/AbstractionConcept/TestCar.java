package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.safety();
		
		
		Car c = new BMW(); // Dynamic polymorphism 
		
		c.start();
		c.stop();
		c.refuel();
		

	}

}
