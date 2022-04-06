package day26;

//abstract class
abstract class Main {
public String fname = "paresh rawal";
public int age = 42;
public abstract void study(); // abstract method 
}

//Subclass (inherit from Main)
class Student extends Main {
public int graduationYear = 2018;
public void study() { // the body of the abstract method is provided here
 System.out.println("Studying all day long");
}
}
public class Abbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    Student myObj = new Student(); 
	    
	    System.out.println("Name: " + myObj.fname);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	    myObj.study(); // call abstract method
	

	}

}
