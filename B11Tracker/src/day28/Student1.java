package day28;
//trying protected


class Person {
	  protected String fname = "rajpal";
	  protected String lname = "yadav";
	  protected String email = "rajpal@yadav.com";
	  protected int age = 33;
	}

public class Student1 extends Person {
	
	private int graduationYear = 2018;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 myObj = new Student1();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);

	}

}
