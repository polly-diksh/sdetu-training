package basics;

public class Cities {

	public static void main(String[] args) {
		//declare and define an array
		String[] cities = {"New York", "San Fransisco", "Maimi", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare the array

		
		///declare the array
		String[] countries;
		//define it
	    countries = new String[3];
		countries[0] = "USA";
		countries[1] = "UK";
		countries[2] = "India";
		System.out.println(countries[2]);
		
		System.out.println("**************************");
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		//System.out.println(states[3]);
		int i=0;
		// do loop enters the loop and tests the conditions
		do {
			System.out.println("STATE: " + states[i]);
			i = i+1;
		} while (i < 5);
		
		// while tests condition first an dthen enters the loop
		int n=0;
		boolean statefound = false;
		while (!statefound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND !");
				statefound = true;
			}
			n++;
		}
		
		System.out.println("printing through for");
		// for loop is best structure to iterate through a loop
		for (int x = 0;x < 5; x++) {
			System.out.println(states[x]);
		}

	}

}
