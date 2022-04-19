package day44;
//multiple threads executing a single task by implementing the Runnable

public class MultithreadDemo1 implements Runnable {
	  
	  public static void main(String[] args) {
	    Thread th1 = new Thread(new MultithreadDemo1());
	    Thread th2 = new Thread(new MultithreadDemo1());
	    
	    th1.start();
	    th2.start();
	  }
	  @Override
	  public void run() {
	    System.out.println("Executing task");
	    
	  }
	}


