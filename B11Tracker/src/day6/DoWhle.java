package day6;

import java.util.Scanner;

public class DoWhle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.print("enter any number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		do
		{
			System.out.println(num);
			num++;
		}
		while(num<=10);

	}

}
