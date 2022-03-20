package day6;

public class Ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		System.out.println(a==b);//f
		System.out.println(a!=b);//t
		System.out.println(a>b);//f
		System.out.println(a<b);//t
		System.out.println(a<=b);//t
		System.out.println(a>=b);//f
		
		//logical operator
		//System.out.println(a==b && a!=b);//false
		//System.out.println(a==b || a!=b);//true
		//System.out.println(!(a>b));//true

		//increment decrement operator
		//int a=10;
		//System.out.println(a--);//10-->9
		//System.out.println(--a);//8
		//System.out.println(a++);//8-->9
		//System.out.println(++a);//10
		
		//assignment operator
		//int a=10;
		//a+=10;//a=a+10
		//System.out.println(a);//20
		
		//ternery operator
		//int a=10,b=20,c=50;
		//int r=(a>b)?(a>c?a:c):(b>c?b:c);//ternary operator
		//System.out.println(r);//50

	}

}
