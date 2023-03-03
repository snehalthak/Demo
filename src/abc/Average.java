package abc;
import java.util.Scanner; // Import the Scanner class
public class Average {
	
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in); //Create a Scanner object
	        System.out.println("Enter the first number: ");
	        double no1 = scan.nextDouble(); //Reads a double value from the user
	        System.out.println("Enter the second number: ");
	        double no2 = scan.nextDouble();
	        System.out.println("Enter the third number: ");
	        double no3 = scan.nextDouble();
	        scan.close();
	        System.out.println("The average of entered numbers is:" + avr(no1, no2, no3) );
	    }

	  public static double avr(double a, double b, double c)
	    {
	        return (a + b + c) / 3;
	    }
	}