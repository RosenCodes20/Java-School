package glava04;

import java.util.Scanner;

public class zad5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("Bigger is: " + Math.max(a, b));
	}
}
