package OOPConcept_02;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		
		
		HSBCBank hs = new HSBCBank(); 
		
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.eduLoan();
		hs.carLoan();
		
		/*
		 * Dynamic Polymorphism:
		 * child class object can be referred by parent Interface reference variables
		 * Only overridden will be called
		 */
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		
		

	}

}
