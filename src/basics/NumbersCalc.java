package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting!");
		printName();
		int num1 = 10;
		int num2 = 20;
		addNumbers(num1, num2);
		int product = multiplyNumbers(num1,num2);
		System.out.println("The product is " + product);
		
	}
	
	static void printName() {
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("This is the sum of the given numbers " + numberA + " and " + numberB + " which is equal to " + sum);
		
	}
	
	static int multiplyNumbers(int numberC, int numberD) {
		int product = numberC * numberD;
		addNumbers(product, product);
		return product;
	}

}
