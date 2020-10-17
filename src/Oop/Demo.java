package Oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name+ " is walking");
	}
	
	void eat() {
		System.out.println(name+ " is eating");
	}
	void sleep() {
		System.out.println(name+ " is sleeping");
	}
}

public class Demo {
	public static void main(String[] args) {
		//Person
		Person person1 = new Person();
		
		person1.name = "Joe";
		person1.email = "Joe@gmail.com";
		person1.phone = "29829837";
		
		person1.walk();
		
		Person person2 = new Person();
		
		person2.name = "Sarah";
		person2.email = "sarah@gmail.com";
		person2.phone = "298293e8199837";
		
		person2.walk();
		person2.eat();
		person2.sleep();
		
		
		
		
		
		
		
		/*
		String name = "Joe";
		String email = "Joe@gmail.com";
		String phone = "28129837893";
		
		//action,activity, behaviour
		//System.out.println(name+" is walking ");
		walking(name);
		System.out.println(name+" is eating ");
		
		//another person
		String name2 = "Sarah";
		String email2 = "sarah@gmail.com";
		String phone2 = "2883278239837893";
		
		//action,activity, behaviour
		//System.out.println(name2+" is walking ");
		walking(name2);
		System.out.println(name2+" is eating ");
		
             */
		}
		/*
	//walking function
	static void walking(String name) {
		System.out.println(name + " is walking");
		
	}*/
	

}

