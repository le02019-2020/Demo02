package JavaBasics;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		
		int i = 1;
		int j = i++; // post increment > value of i given to j then i value will increase 
		
		System.out.println(i);
		System.out.println(j);
		
		int a = 1;
		int b = ++a; // pre increment
		
		System.out.println(a);
		System.out.println(b);
		
		int m = 2;
		int n = m--; // post decrement
		
		System.out.println(m);
		System.out.println(n);
		
		int m1 = 2;
		int n1 = --m1; // pre increment
		
		System.out.println(m1);
		System.out.println(n1);
		
	

	}

}
