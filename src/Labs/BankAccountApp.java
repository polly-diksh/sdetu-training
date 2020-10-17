package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("734723846", 1000);
		BankAccount acc2 = new BankAccount("454723846", 2000);
		BankAccount acc3 = new BankAccount("674723846", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(2000);
		acc2.makeDeposit(500);
		
		acc1.accrue();
		
		System.out.println(acc1.toString());		
	

	}

}

class BankAccount implements IInterest {
	//properties of bank account
	private static int ID = 1000;
	private String accountNumber;
	private static final String routingNumber = "004547832";
	private String SSN;
	private String name;
	private double balance;
	
	//constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New account created!");
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);		
		accountNumber = ID + "" + random + SSN.substring(0,2);
		System.out.println("Your account number : "+accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying Bill for :" + amount);
		balance = balance - amount;
		showBalance();
		
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit for :" + amount);
		balance = balance + amount;
		showBalance();
		
	}
	
	public void showBalance() {
		System.out.println("Net Balance : "+balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
		
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: "+accountNumber+"\n" + "[Routing Number: " + routingNumber + "]\n";                 
	}

}