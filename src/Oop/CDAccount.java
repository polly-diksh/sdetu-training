package Oop;

public class CDAccount extends Bankaccount implements I{
	String interestRate;
	
	void compound() {
		System.out.println("Compounding Interest");
	}

}
