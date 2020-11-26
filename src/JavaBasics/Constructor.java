package JavaBasics;

public class Constructor {
	
	
	public Constructor(){  // default constructor 
		System.out.println("default constructor");
	}
	
	public Constructor (int i){
		System.out.println("single param cons");
		System.out.println("the value of i " + i);
	}
	
	public Constructor (int i , int j){
		System.out.println("two param cons");
		System.out.println("the value of i " + i);
		System.out.println("the value of j " + j);
		
	}
	
	

	public static void main(String[] args) {
		
		Constructor obj = new Constructor ();
		Constructor obj1 = new Constructor (10);
		Constructor obj2 = new Constructor (10,20);

	}

}
