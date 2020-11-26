package OOPConcept_02;

public class HSBCBank implements USBank, BrazilBank{  // multiple inheritance  >> Is a Relationship

	
	/* To Implement Interface :
	 * define/ override all methods from Interface
	*/
	
	
	@Override
	public void credit() {
		System.out.println("HSBC > Credit");
			
	}

	
	@Override
	public void debit() {
		System.out.println("HSBC > Debit");
			
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC > TranferMoney");
			
	}
	
	public void eduLoan(){
		System.out.println("HsBC > EduLoan");
	}
	
	public void carLoan(){
		System.out.println("HsBC > carLoan");
	}
	
	public void mutualFund(){
		System.out.println("Brazil Bank");
	}


}
