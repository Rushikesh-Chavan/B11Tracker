package day27;
//Accessing class methods using objects

public class justcar {
	  // Creating a method
	  public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }

	  // Creating a  method and add a parameter
	  public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	  }

	  
	  // Inside main, call the methods on the myCar object

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		justcar myCar = new justcar();     // Create a myCar object
	    myCar.fullThrottle();      // Call the fullThrottle() method
	    myCar.speed(200);          // Call the speed() method

	}

}
