package OOPConcept_01;

public class StaticAndNonStatic {
	
	String name = "Leo";
	static int age = 25;

	public static void main(String[] args) {
	
	/* Call Static methods and variables :
	 * direct calling : 
	 * calling by Class Name 
	 */
		
		sum(); //  direct calling : 
		StaticAndNonStatic.sum(); // calling by Class Name 
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		/*
		 * Calling Non Static methods. 
		 * create an object
		 */
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		// Can we access static methods using object references >> yes but warning will be given 
		obj.sum();
		
	}
	
	public void sendMail(){
		System.out.println("send Mail method");
	}
	
	public static void sum(){
		System.out.println("sum method");
	}

	
		
	}


