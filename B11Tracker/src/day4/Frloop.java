package day4;

import java.util.Scanner;

public class Frloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.print("enter any number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}

	}

}
