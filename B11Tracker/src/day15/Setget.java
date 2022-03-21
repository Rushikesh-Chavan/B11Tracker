package day15;

class Student {  
	  
	private String name;  //private data member
	  
	public String getName() //getter method for name
	{  
	return name;  
	}  
	 
	public void setName(String name) //setter method for name 
	{  
	this.name=name;  
	}  
	}  

public class Setget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Student s=new Student();  //creating instance of the encapsulated class
		  
		s.setName("Ajay");  //setting value in the name member
		 
		System.out.println(s.getName());  //getting value of the name member 

	}

}
