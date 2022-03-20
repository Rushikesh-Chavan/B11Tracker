package day10;

import java.util.Scanner;

public class ScannerC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer data : ");
		int x = sc.nextInt();
		System.out.println(x);
		
		System.out.println("Enter the string : ");
     	String str = sc.nextLine();
		System.out.println(str);
		
		System.out.println("Enter the second string : ");
     	String str2 = sc.nextLine();
		System.out.println(str2);
		
		/*String input can quickly be taken from the user if the buffer is free,i.e., 
		 * there is only string input at the very start of the code. But what if not? If there is any
		 *  other method before the string method that could be nextInt() or nextFloat() or any nextXxx() method,
		 *   then nextLine() would be skipped.

				It is the major drawback of Scanner Class.*/

	}

}
