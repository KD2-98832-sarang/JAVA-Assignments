import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter first value: ");

	        if (!sc.hasNextDouble()) {
	        	
	        System.out.println(" Please enter a double value.");
	            return;
	        }

	        double num1 = sc.nextDouble();

	        System.out.print("Enter second value: ");

	        if (!sc.hasNextDouble()) {
	            System.out.println(" Please enter a double value.");
	            return;
	        }

	        double num2 = sc.nextDouble();
	        double average = (num1+num2)/2;

	        System.out.println("Avg of no = "+ average);
	    }
	}