package day3;

class A // super class
{
	public void m1()
	{
		System.out.println("Hello Everyone!!");
	}
}
class B extends A // sub class
{
	public void m2()
	{
		System.out.println("Welcome Everyone!!");
	}
	public void m1() // method overriding
	{
		System.out.println("Good morning!!");
	}
	public void m1(String s)
	{
		System.out.println(s);
	}
}
class D
{
	public D()// constructor
	{
		
	}
	public void m1()
	{
		System.out.println("Hello Everyone!!");
	}
}
public class C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a,a1;
		B b;
		a=new A();// initializing variable a(LHS) with object(RHS)
		a1=new A();// instantiating the object(RHS) to reference variable a1(LHS)
		b=new B();
		a1=a;
		a1.m1();// hello everyone- calling method with reference variable
		a1=b;
		b.m1();// good morning
		a1.m1();//good morning
		//a1.m2();// method is undefined for type a- cannot access 
		D d = new D();
		d.m1();// hello everyone
		
	}

}
