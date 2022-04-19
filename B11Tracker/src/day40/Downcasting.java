package day40;

  
class Parent1 {   
  String name;   
  
    
  void showMessage()   
  {   
      System.out.println("Parent method is called");   
  }   
}   
  

class Child1 extends Parent1 {   
  int age;   
  
  
  @Override  
  void showMessage()   
  {   
      System.out.println("Child method is called");   
  }   
}   
public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent1 p = new Child1();  
        p.name = "Shubham";  
          
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        Child1 c = (Child1)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   

	}

}
