package day11;

import java.util.Scanner;

public class Lop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks;
		System.out.print("Enter marks:= ");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		
		if(marks>=60 && marks<=100)
		{
			System.out.print("first division");
		}
		
		else if(marks>=45 && marks<60)
		{
			System.out.print("second division");
		}
		
		else if(marks>=33 && marks<45)
		{
			System.out.print("third division");
		}
		
		else
		{
			System.out.print("fail");
		}
		
	}

}
