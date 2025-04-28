package glava04;

import java.util.Scanner;

public class zad2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int radius = input.nextInt();
		
		double perimeter = 2 * Math.PI * radius;
		
		double area = Math.PI * radius * radius;
		
		System.out.println("Perimeter is: " + perimeter);
		System.out.println("Area is: " + area);
	}
}
