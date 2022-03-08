package day1;

class Quadrilaterals
{
	int a=2,b=3,c=4,d=5;
	void perimeter()
	{
		int p=(a+b+c+d);
		System.out.println("perimeter of quadrilateral is:"+p);
	}
}
class Squ extends Quadrilaterals
{
	void perimeter()
	{
		int p=4*a;
		System.out.println("perimeter of Square is:"+p);
	}
	
}
class Rect extends Quadrilaterals
{
	void perimeter()
	{
		int p=2*(a+b);
		System.out.println("perimeter of Rectangle is:"+p);
	}

	
}
class Trap extends Quadrilaterals
{
	void perimeter()
	{
		int p=(a+b+c+d);
		System.out.println("perimeter of Trapezium is:"+p);
	}

	
}
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Squ s=new Squ();
		Rect r=new Rect();
		Trap t=new Trap();
		
		s.perimeter();
		r.perimeter();
		t.perimeter();
		
		

	}

}
