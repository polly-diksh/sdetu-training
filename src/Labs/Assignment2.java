package Labs;

public class Assignment2 {
	public static void main(String[] args) {
		St std1 = new St("Jackie",  "123456789");
		St std2 = new St("Francis", "234567890");
		St std3 = new St("Claire",  "345678901");
		
		std1.enroll("English5:30");
		std1.enroll("Comm8");
		std1.pay(500);
		std1.showCourses();
		std1.checkBalance();
		System.out.println(std1.toString());
		
		std2.enroll("Chem9");
		std2.enroll("Bio8");
		std2.pay(2500);
		std2.showCourses();
		std2.checkBalance();
		System.out.println(std2.toString());
		
		std3.enroll("Hist7");
		std3.enroll("Math10:30");
		std3.pay(5000);
		std3.showCourses();
		std3.checkBalance();
		System.out.println(std3.toString());		
	}
}

class St{
	//properties
	private static final int CourseDue = 800;
	private static int ID = 1000;
	private String userID;
	private String courses="";
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String state;
	private String city;
	private int Balance=0;
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}

	public void setState(String state) {
		this.state = state;
	}	
	public String getState() {
		return state;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}	
	//constructor
	public St(String name, String SSN) {
		ID++;
		this.name = name;
		this.SSN = SSN;
		setEmail();
		setUserID();
	}
	//create an email id automatically based on the name of the student
	
	private void setEmail() {
		email = name.toLowerCase()+"@gmail.com";		
	} 
	private String getEmail() {
		return email;
	}

	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int random =  (int) (Math.random()*1000)*(max-min);
		random = random + min;
		userID = ID +"" + random + SSN.substring(6);		
	}	
	private String getUserID() {
		return userID;
	}
	
	public void enroll(String courses) {
		this.courses = this.courses + " " + courses;
		Balance = Balance + CourseDue;		
	}
	
	public void pay(int amount) {
		Balance =  Balance - amount;		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $"+Balance);		
	}
	
	public String toString() {
		return "[NAME: "+name+ "]\n[userID: " +userID+ "]\n[email ID: "+email+ "]\n[BALANCE: $"+Balance+ "]";
	}
	
	public void showCourses() {
		System.out.println("Enrolled courses : "+courses);		
	}		
}
