package OOPConcept_01;

public class FunctionsinJava {

	// main method > starting point of execution 
	// main method is void and never a value
	public static void main(String[] args) {
		
		FunctionsinJava obj = new FunctionsinJava();  // obj is the reference variable
		// after creating the object copy of all non static methods will given to the object
		obj.test();
		
		obj.qa();
		String s1 = obj.qa();
		System.out.println(s1);
		
		
		obj.pqr();
		int l =obj.pqr();
		System.out.println(l);
		
		
		int div = obj.divisions(30, 10);
		System.out.println(div);
		
		

	}
		
	// non function Methods:
	// return type >> void
	public void test(){  // return type = void >  does not return any value  
		System.out.println("test method");
	}

	//return type >> int
	public int pqr(){ // no input but some output
		System.out.println("PQR Method");
		int a  = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//return type >> String
	public String qa(){ // no input but some output
		System.out.println("QA Method");
		String s = "Selenium";
		
		return s;
	}
	
	//return type >> int
	public int divisions(int x, int y){  // x and y is input parameter or argument
		System.out.println("division mehtod");
		int d = x/y;
		
		return d;
	}
	
	
	
}
