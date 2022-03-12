package day5;

class Car
{
	public static int gear, speed;  // static variable
	boolean clutch, brake, accelerator;
	
	public void start()
	{
		// garbage collection of unused objects created in heap memory
	}
	public void stop()
	{
		
	}
	public void setspeed(int i)
	{
		speed=i;
	}
	public int getspeed()
	{
		return speed;
	}
}
public class DemoCar {

	static boolean a1,a2;
	
	public static void main(String[] args) {   // static method
		// TODO Auto-generated method stub
		
		//boolean a1,a2;// global variable
		//DemoCar d= new DemoCar();
		System.out.println(DemoCar.a1);
		
		/*Car c1,c2; // local variable
		c1=new Car();
		c2=new Car();
		//c1.speed=100;
		//c2.speed=200;
		c1.setspeed(100); // calling instance method
		//c2.speed=200;
		//c2.setSpeed(200);
		System.out.println(c1.getspeed());
		//System.out.println(car.speed);
*/
	}

}
