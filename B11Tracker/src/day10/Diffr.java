package day10;

import java.util.Scanner;

public class Diffr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter an integer:");// if written first shows improper output
		int a = scn.nextInt();
		System.out.println("You have entered:- "+ a);
		
		
		System.out.print("Enter a String:");
		String b = scn.nextLine();
		System.out.println("You have entered:- "+ b); 
		
		System.out.print("Enter a byte:");
		byte c = scn.nextByte();
		System.out.println("You have entered:- "+ c);
		
		/*System.out.print("Enter an integer:");// if written here shows error in proper format
		int a = scn.nextInt();
		System.out.println("You have entered:- "+ a);*/
		
		/*String input can quickly be taken from the user if the buffer is free,i.e., 
		 * there is only string input at the very start of the code. But what if not? If there is any
		 *  other method before the string method that could be nextInt() or nextFloat() or any nextXxx() method,
		 *   then nextLine() would be skipped.

				It is the major drawback of Scanner Class.*/
		

	}

}
