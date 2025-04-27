package glava03;

import java.util.Scanner;

public class zad9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y coordinate: ");
        double y = sc.nextDouble();

        double distance = Math.sqrt(x * x + y * y);
        double radius = 5;

        boolean outsideRectangle = (x < -1 || x > 5 || y < 1 || y > 5);

        if (distance <= radius && outsideRectangle) {
            System.out.println("The point is inside the circle and outside the rectangle.");
        } else {
            System.out.println("The point does not meet the conditions.");
        }
	}
}
