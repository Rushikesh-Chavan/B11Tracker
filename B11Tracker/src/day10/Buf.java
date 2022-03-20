package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buf {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));// InputStreamReader r=new InputStreamReader(System.in);    
	      System.out.print("Enter you string here:");
	      String obj = bf.readLine();
	      System.out.println("output:" + obj);

	}

}
