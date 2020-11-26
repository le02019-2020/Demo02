package OOPConcept_01;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x  = "100";
		System.out.println(x+20);
		
		// data conversion : String to int 
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		// data conversion : String to Double
		String y = "12.50";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		// data conversion : String to Boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		// data conversion : int to String 
	    int j = 200;
	    System.out.println(j+20);
	    String s = String.valueOf(j);
	    System.out.println(s+20);
	    
	    // NumberFormatException >> String s = "100A" >> only pure String is allowed
	
	}

}
