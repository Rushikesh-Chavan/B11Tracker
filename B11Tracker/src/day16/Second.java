package day16;

abstract class Main

	{
	  public String fname = "John";
	  public int age = 24;
	  public abstract void study(); // abstract method
	}


	class Student extends Main // Subclass (inherit from Main)
	{
	  public int graduationYear = 2018;
	  
	  public void study() // the body of the abstract method is provided here
	  { 
	    System.out.println("Studying all day long");
	  }
	}
	

public class Second {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		// create an object of the Student class (which inherits attributes and methods from Main)
	    Student myObj = new Student();

	    System.out.println("Name: " + myObj.fname);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	    myObj.study(); // call abstract method

	}

}
