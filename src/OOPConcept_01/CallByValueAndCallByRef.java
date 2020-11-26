package OOPConcept_01;

public class CallByValueAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x = 10;
		int y = 20;
		obj.testSum(x, y);  // call or pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int testSum(int a, int b){
		int c = a+b;
		return c;
		
	}
	
	// call by reference
	public void swap(CallByValueAndCallByRef t){
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		

	}
	
}
