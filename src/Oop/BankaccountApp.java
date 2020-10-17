package Oop;

public class BankaccountApp {
	public static void main(String[] args) {
		//create a new bank account 
		
		Bankaccount acc1 = new Bankaccount();
		acc1.setName("Houston Hue");
		System.out.println(acc1.getName());
		acc1.accountNumber = "71378721";		
		acc1.Balance = 10000;		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.setSsn("388394293");
		System.out.println("SSN: " + acc1.getSsn());
		System.out.println(acc1.toString());
		
		/*
		System.out.println(acc1.toString());
		Bankaccount acc2 = new Bankaccount("Checking Account");
		acc2.accountNumber = "298129812";
		Bankaccount acc3 = new Bankaccount("Savings account ", 5000);
		acc3.accountNumber = "8173831289";
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.Balance = 3000;
		cd1.accountType = "Cd account";
		cd1.name = "Juan";
		cd1.interestRate = "4.5";
		System.out.println(cd1.toString());
		
		//constructors- unique methods
		// used to define or setup initialise properties of an object
		//they're implicitly called upon instantiation
		// as soon an object is created , constructors will get called automatically
		// has the same name as the class. 
		// have no return type
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
	*/	
	}

}
