package Labs;

public class Lab2 {

	public static void main(String[] args) {
		/*
		 * Create a database constructor with the following attributes:
		 * 1.New student constructor that takes name and SSN in the arguments
		 * 2. Automatically create an email ID based on the name 
		 * 3. set a private static ID
		 * 4. generate a user ID that is comb of static ID, random 4-digit number between 1000-9000, and last 4-digit of SSN
		 * Methods: enroll(), pay(), checkBalance(), toSTring(), showCourses()
		 * Use encapsulation to set variables (phone, city, state)
		 *  
		 */
		Student stu1 = new Student("Janelle", "738623678");
		Student stu2 = new Student("Thomas", "773245356");
		Student stu3 = new Student("Elizabeth", "773783223");
		
		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");
		
		stu1.showCourses();
		stu1.checkBalance();
	    stu1.payTuition(2400);
	    stu1.checkBalance();
	    System.out.println(stu1.toString());

	}
	

}

class Student{
	//properties
	private static int ID = 1000;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String state;
	private String city;

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


	private String courses="";
	private static final int costofCourse = 800;
	private int balance=0;
	
	public Student(String name, String SSN) {
		ID++;
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmail();
		
	}
	
	private void setEmail() {
		email = name.toLowerCase() +"."+ ID + "@studentuniversity.com";
		System.out.println("Email ID : " + email);
	}
	public String getEmail() {
		return email;
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum =  (int) (Math.random()*10000)*(max-min);
		randNum = randNum + min;
		System.out.println(randNum);
		userID = ID +"" + randNum + SSN.substring(6); //take the no. after index 6 of SSN
		System.out.println("User ID : " + userID);
	}
	
	public void enroll(String courses) {
		this.courses = this.courses + " " + courses;
		balance = balance + costofCourse;
		
	}
	
	public void payTuition(int amount) {		
		System.out.println("Payment being done of total: $" + amount);
		balance = balance-amount;
		
	}
	
	public void checkBalance()
	{
		System.out.println("Balance: $"+balance);
		
	}
	
	public String toString() {
		return "[NAME: " + name + "]\n[COURSES: " + courses + "]\nBALANCE: $" + balance;
		
		 
	}
	
	public void showCourses() {
		System.out.println("Enrolled courses : "+courses);
		
	}
	
}
