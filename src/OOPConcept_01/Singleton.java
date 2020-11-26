package OOPConcept_01;

public class Singleton {
	
	/*
	 * Singleton Class: 
	 * 
	 * One object (class instance) at a time.
	 * 
	 * How to Design : 
	 * make constructor private
	 * static method (getInstance) has a return type > object the Singleton Class (lazy Initialization)
	 */
	
	
	private static Singleton singleton_instance = null; // reference variable
	
	public String str;
	
	private Singleton(){
		str = "using singleton ";
	}
	
	public static Singleton getInstance(){
		if(singleton_instance == null)
			singleton_instance = new Singleton();
			return singleton_instance;
		
	}
	

	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
