package OOPConcept_01;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	
	public static void main (int p){  // main method overloaded
		
	}
	
	public static void main (int p, int q){
		
	}	
	
	// method over loading : when method name is same with different arguments or input parameters or different data types within the same class. 
	// can not create a method inside a method 
	// duplicate methods with same arguments not allows 
	public void sum(){
		System.out.println("sum method ---- zero parameter");
	}
	
	public void sum (int i){   // 1 input parameter
		System.out.println("Sum Method > 1 input");
	}
	
	public void sum(int k, int l){  // 2 input parameter
		System.out.println("Sum Method > 2 inputs");
	}
	
}
