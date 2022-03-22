package day16;

abstract class MyClass {
	   protected abstract void display();
	}

public class Testabs extends MyClass {
	
	 public void display() {
	      System.out.println("This is the subclass implementation of the display method ");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 new Testabs().display();
	}

}
