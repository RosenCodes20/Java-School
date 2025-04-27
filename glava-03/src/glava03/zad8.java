package glava03;

import java.util.Scanner;

public class zad8 {
	public static void main (String[] args) {
		  Scanner sc = new Scanner(System.in);

	      System.out.print("Enter x coordinate: ");
	      double x = sc.nextDouble();
	      System.out.print("Enter y coordinate: ");
	      double y = sc.nextDouble();

	        // Calculate the distance from the point to the center (0,0)
	      double distance = Math.sqrt(x * x + y * y);
	      double radius = 5;

	      if (distance <= radius) {
	            System.out.println("The point is inside the circle.");
	      } else {
	            System.out.println("The point is not inside the circle.");
	      }
	}
}
