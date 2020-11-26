package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {
		
		// while loop  > will generate infinite loop if no incremental/decremental 
		
		int i = 1; // initialization 
		while (i<=10){  // conditional 
			System.out.println(i);
			i = i+1; // incremental / decremental
		}
		
		System.out.println("===========");
		
		// for loop:
		
		for( int j = 1; j<=10; j++){ // initialization > conditional > incremental
			System.out.println(j);
		}
		
		for ( int k =10; k>=-10; k--){
			System.out.println(k);
		}

	}

}
