package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		//Fibonacci n3 = n2+n1 //uses recursion
		//fib(0) = 0
		//fib(1) = 1
		//fib(2) =1
		//fib(3) = 2
		//fib(4) = 3
		//fib(5) = 5
		System.out.println(fib(5));

	}
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

}
