package day1;

class Recta {
	  
    // Overloaded Area() function to
    // calculate the area of the rectangle
    // It takes two double parameters
    void Area(double S, double T)
    {
        System.out.println("Area of the rectangle: "
                           + S * T);
    }
  
    // Overloaded Area() function to
    // calculate the area of the rectangle.
    // It takes two float parameters
    void Area(int S, int T)
    {
        System.out.println("Area of the rectangle: "
                           + S * T);
    }
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating object of Rectangle class
        Recta obj = new Recta();
  
        // Calling function
        obj.Area(20, 10);
        obj.Area(10.5, 5.5);

	}

}
