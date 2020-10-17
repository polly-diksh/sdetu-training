package Oop;

public class LoanAccount implements I {
	@Override
	public void setRate() {
		System.out.println("Rate");
	}
	@Override
	public void increaseRate() {
		System.out.println("increase rate");
	}
	
	public void setTerm(int terms) {
		System.out.println("Setting the term to :" + terms);
		
	}
	public void setAmmortSchedule() {
		System.out.println("Ammorizaqtion schedule");
	}


}
