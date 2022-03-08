package day1;

class Shape  
{  
          public int length = 10;  //define a length which is public and can be used in square, rectangle and circle classes  

}  
  
//inherit the properties of Shape class with the use of extends keyword  
  
class Square extends Shape  
{  
     void area()  
     {    
          int area = length * length;  //calculate area of square  
          System.out.println("Area of square : "+area);  
     }  
}  
  
class Rectangle extends Shape  
{  
     void area()  
     {   
          int breadth = 7;  //define breadth 
          int area = length * breadth;  // calculate area
          System.out.println("Area of rectangle : "+area);  
     }  
}  
  
class Circle extends Shape  
{  
     void area()  
     {   
          double area = 3.14 * length * length; // float f  //calculate area of circle using length of the shape class as radius 
          System.out.println("Area of circle : "+area);  
     }  
}  
  
// class which contains main method  

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Square sq = new Square();   // creating objects of child class  
        Rectangle rec = new Rectangle();  
        Circle cir = new Circle();  
          
        sq.area();  //call the area methods of all child class to get the area of different objects  
        rec.area();  
        cir.area();

	}

}
