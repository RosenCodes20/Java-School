package glava04;

import java.util.Scanner;

public class zad4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		for (int i = a; i <= b; i++) {
			if (i % 5 == 0) {
				System.out.println("It is at 5: " + i);
			}
		}
	}
}
