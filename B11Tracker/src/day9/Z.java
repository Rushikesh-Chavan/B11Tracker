package day9;
// multi-level inheritance
class X
{
   public void methodX()
   {
     System.out.println("Class X method");
   }
}
class Y extends X
{
public void methodY()
{
System.out.println("class Y method");
}
}
public class Z  extends Y{
	public void methodZ()
	   {
	     System.out.println("class Z method");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Z obj = new Z();
	     obj.methodX(); //calling grand parent class method
	     obj.methodY(); //calling parent class method
	     obj.methodZ(); //calling local method

	}

}
/* 
 o/p: Class X method
class Y method
class Z method
*/