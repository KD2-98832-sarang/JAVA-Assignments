```java
import java.util.Scanner;

// User-defined exception
class NegativeDiameterException extends Exception {
	public NegativeDiameterException(String message) {
		super(message);
	}
}

class Circle {
	private double myX;
	private double myY;
	private double myDiameter;


	public Circle() {
		myX = 0;
		myY = 0;
		myDiameter = 100;
	}


	public Circle(double x, double y, double diameter)
			throws NegativeDiameterException {

		if (diameter < 0) {
			throw new NegativeDiameterException(
					"Diameter cannot be negative");
		}

		myX = x;
		myY = y;
		myDiameter = diameter;
	}

	
	public double getMyX() {
		return myX;
	}


	public double getMyY() {
		return myY;
	}


	public double getMyDiameter() {
		return myDiameter;
	}


	public void setMyDiameter(double diameter)
			throws NegativeDiameterException {

		if (diameter < 0) {
			throw new NegativeDiameterException(
					"Diameter cannot be negative");
		}

		myDiameter = diameter;
	}
}


public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter X coordinate: ");
			double x = sc.nextDouble();

			System.out.print("Enter Y coordinate: ");
			double y = sc.nextDouble();

			System.out.print("Enter diameter: ");
			double diameter = sc.nextDouble();

			Circle c = new Circle(x, y, diameter);

			System.out.println("\nCircle Details:");
			System.out.println("X = " + c.getMyX());
			System.out.println("Y = " + c.getMyY());
			System.out.println("Diameter = " + c.getMyDiameter());

		} catch (NegativeDiameterException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
```
