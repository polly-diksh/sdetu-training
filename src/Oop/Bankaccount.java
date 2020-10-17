package Oop;

public class Bankaccount implements I {


		String accountNumber;
		private static final String routingNumber = "0129127";
		//static - belongs to the class, not the object instance
		// final - constant
		private String name;
		private String ssn;
		
		
		
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public void setRate() {
			System.out.println("SYSTEM RATE");
		}
		public void increaseRate() {
			System.out.println("INCREASING RATE");
		}
		
		
		
		
		String accountType;
		double Balance = 0;
		
		//constrructor
		Bankaccount(){
			System.out.println("New account created.");
		}
		// overloading call same method name with different arguments
		Bankaccount(String accountType){
			System.out.println("New account" + accountType);						
		}
		Bankaccount(String accountType, double initDeposit){
			System.out.println("New account : " + accountType);
			System.out.println("Initial deposit of $ " + initDeposit);
			String Msg = null;
			if (initDeposit < 5000) {
				Msg = "ERROR: Minimum deposit must be atleast $5000";
				
			} else {
				Msg = "Thanks for your initial deposit of : $"+initDeposit;
			}
			System.out.println(Msg);
			Balance =  initDeposit;
		}
		public void setName(String name) {
			this.name = "Mr." + name;
		}
		public String getName() {
			return name;
		}
		
		//define methods
		public void deposit(double amount) {
			Balance = Balance + amount;
			showActivity("DEPOSIT");
			
		}
		void withdraw(double amount) {
			Balance = Balance + amount;
			showActivity("WITHDRAW");
			
		}
		private void showActivity(String activity) {
			System.out.println("Your recent transaction" + activity);
			System.out.println("Your new balance" + Balance);
			
		}
		void checkBalance() {
			System.out.println("Balance is :" + Balance);
			
		}
		void getStatus() {
			
		}
		@Override
		public String toString() {
			return "[" + name + "," + accountNumber + "," +"ROUTING #"+routingNumber+ "Balance: $"+ Balance+ "]";
		}

	

}
