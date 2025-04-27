package glava03;

import java.util.Scanner;

public class zad7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");

		int intnumber = input.nextInt();
		
		double personWeight = intnumber * 0.17;
		
		System.out.println("Person weight: " + personWeight);
	}
}
