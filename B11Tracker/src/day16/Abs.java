package day16;


abstract class A
{
	static int c;
	final int i=10;
	private int d;
	
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	void a1()
	{
		System.out.println("hello");
		
	}
	abstract void a2();
	
	//abstract A();// constructor
	 //abstract int b; variable
	//abstract final void m1();
	//abstract static void m1();
	//abstract private void m1();
}

 class B extends A
 {
	  void a2()
	  {
		  System.out.println("Hi");
	  }
	   
 }
public class Abs  {
	/*void a2()
	{
		
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  B obj=new B();
		  obj.a1();
		  obj.a2();
		  obj.setD(11);
		  System.out.println(obj.getD());
		  
		  
		
		
		

	}

}
