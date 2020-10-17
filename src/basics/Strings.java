package basics;

public class Strings {
	public static void main(String[] args) {
		String bookTitle ;
		String wordChoice = "Ring";
		bookTitle = "The lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The contains the word " + wordChoice);
		}
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
			
		}
		String firstname = "Tim";
		String lastname = "Short";
		String SSN = "931923791830";
		System.out.println("There are " + SSN.length() + " digits in your SSN. It should be 10.");
		System.out.print(firstname.substring(0,1));
		System.out.print(lastname.substring(0,1));
		System.out.print(SSN.substring(5));
		
	}

}
