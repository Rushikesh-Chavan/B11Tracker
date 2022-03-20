package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buff {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
				      System.out.println("Enter your integer data here:");  
				      int x = Integer.parseInt(bf.readLine());
				      
				      System.out.println("Enter your float data here:");
				      float y = Float.parseFloat(bf.readLine());
				      
				      System.out.println("Enter your string here:");
				      String obj = bf.readLine();
				      
				      System.out.println("Cast from string to Integer: "+ x);
				      System.out.println("Cast from String to Float: "+ y);
				      System.out.println("Normal string:" + obj);

	}

}
