package basics;

public class SalaryCalculator {
	public static void main(String[]args) {
		//create a variable to define our career
		// declare a variable
		String career;
		System.out.println("Program is starting");
		career = "Software developer";
		System.out.println("My Career:"+ career);
		
		//declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 54;
		double rate = 42.50;
		career = "web developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $"+salary+" per year.");
		
		
				
	}

}
