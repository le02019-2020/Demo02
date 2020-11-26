package JavaBasics;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class ConstructorWithKws {

	
	String name;  // Class variable will be initialize with this kws
	int age ;
	
	public ConstructorWithKws (String name, int age){
		
		this.name = name;  // global variable = local variable
		this.age = age;
		name = name;
		
		System.out.println(name);
		System.out.println(age);
	}
		

	
	
	public static void main(String[] args) {
		
		ConstructorWithKws obj = new ConstructorWithKws("leo", 4); 
	}

}
