package day44;
//Execute a single task by multiple threads

public class MultithreadDemo extends Thread{

	  public void run() {
	    System.out.println("Executing task");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultithreadDemo t1 = new MultithreadDemo();
		MultithreadDemo t2 = new MultithreadDemo();
	    MultithreadDemo t3 = new MultithreadDemo();
	    
	    t1.start();
	    t2.start();
	    t3.start();

	}

}