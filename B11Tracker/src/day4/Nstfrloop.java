package day4;

public class Nstfrloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20,num2=100,num3=45;
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.print("maximum number: "+num1);
			}
			else
			{
				System.out.print("maximum number: "+num3);
			}
		}
		
		else
		{
			
			if(num2>num3)
			{	
				System.out.print("maximum number: "+num2);
			}
			else
			{
				System.out.print("maximum number: "+num3);
			}
		}

	}

}
