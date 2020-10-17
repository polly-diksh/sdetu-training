package basics;

public class Weather {
	public static void main(String[] args) {
		//this program will give suggestions based on the climate
		int temperature = 67;
		String sunCondition = "overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleassant , wear shorts and a tshirt");
		}
		else if ((temperature > 60) && (sunCondition == "sunny")) {
			System.out.println("It's a little cooler. wear something light but full");
			System.out.println("Wear a hat, it's sunny out.");
		}
		else if ((temperature > 50) || (sunCondition == "overcast")) {
			System.out.println("This is a cool day. make sure to wear warmer clothes.");
		}
		else {
			System.out.println("looks like a cold day. bring in a sweater");
		}
		
		System.out.println("Program is ending.");
	}

}
