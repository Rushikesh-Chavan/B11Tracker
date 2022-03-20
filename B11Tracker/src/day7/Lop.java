package day7;

import java.util.Scanner;

public class Lop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num;
		System.out.print("enter any number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		while(num>=0)
		{
			if(num%2==0)
			{
				System.out.print("even number");
				break;
			}
			else
			{
				System.out.print("odd number");
				break;
			}
	}

	}}
