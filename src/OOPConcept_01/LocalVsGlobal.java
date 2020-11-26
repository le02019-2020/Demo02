package OOPConcept_01;

public class LocalVsGlobal {
	
	
	// Global Variable or class variable
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		
		LocalVsGlobal obj = new LocalVsGlobal();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	
	public void sum(){
		
		int i = 15;
		int j = 20;
		int age = 25;
	}
	
	
	
	

}
