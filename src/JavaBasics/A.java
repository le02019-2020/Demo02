package JavaBasics;

public class A {
	
	public A(){
		System.out.println("parent Cont");
	}

	
	public A(int i){
		System.out.println("parent Cont with 10" + i);
	}
	
	public A(int i, int j){
		System.out.println("parent Cont with 010" + i);
		System.out.println("parent Cont with 10" + j);
	}
}
