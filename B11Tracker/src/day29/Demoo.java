package day29;

//Pass Method as Argument



public class Demoo {


	  // calculate the sum
	  public int add(int a, int b) {

	    // calculate sum
	    int sum = a + b;
	    return sum;
	  }

	  // calculate the square
	  public void square(int num) {
	    int result = num * num;
	    System.out.println(result);    // prints 576
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    Demoo obj = new Demoo();
	    obj.square(obj.add(15, 9)); // call the square() method and passing add() as an argument

	}

}
