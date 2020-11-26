package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/* to store similar data type values
		 * one dim array
		 * disadvantages : 
		 * 1. size is fixed > static array 
		 * 2. store only similar data types
		 * to solve this problem we use Object Array > Collections  called as dynamic array
		 * 	 */
		
				
		//1 . int array:
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[3]);
		System.out.println(i.length);
		
		for (int j = 0; j<i.length; j++){
			System.out.println(i[j]);
		}

	
	   //2 . Double Array:
		double d [] = new double[3];
		d[0] = 12.33;
		d[1] = 25.63;
		d[2] = 36.45;
		
		System.out.println(d[2]);
		System.out.println(d.length);
		
		for(int e = 0; e<d.length; e++ ){
		System.out.println(d[e]);
		}
		
		// 3. Char array:
		char c[] = new char[3];
		c[0] = 'g';
		c[1] = '2';
		c[2] = '@';
		
		// 4. boolean array:
		boolean b [] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		// 5. String array:
		String s[] = new String[2];
		s[0] = "test";
		s[1] = "hello";
		
		System.out.println(s.length);
		for(int a =0; a<s.length;a++){
			System.out.println(s[a]);
		}
	
		// Object Array: Object is the super Class can save different data types
		
		Object ob[] = new Object[6];
		ob[0] = "Leo";
		ob[1] = 4;
		ob[2] = 12.33;
		ob[3] = 6/18/2020;
		ob[4] = 'M';
		ob[5] = "NY";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for(int a =0; a<ob.length;a++ ){
			System.out.println(ob[a]);
		}
		
	
	
	}

}
