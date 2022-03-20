package day12;

import java.util.Scanner;

public class Scase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c,ch;
		System.out.print("Enter any two number: ");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.print("Enter your choice of operation: ");
		ch=s.nextInt();
		
		switch(ch)
		{
		case 1: c=a+b;
			System.out.print("Addition of two numbers: "+c);
			break;
		case 2: c=a-b;
			System.out.print("Substraction of two numbers: "+c);
			break;
		case 3: c=a*b;
			System.out.print("Multiplication of two numbers: "+c);
			break;
		case 4: c=a/b;
			System.out.print("Division of two numbers: "+c);
			break;
		case 5: c=a%b;
			System.out.print("Modulus of two numbers: "+c);
			break;
		default:System.out.print("invalid choice of operation");
		}
		
	}

}
