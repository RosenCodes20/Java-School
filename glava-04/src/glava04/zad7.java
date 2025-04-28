package glava04;

import java.util.Scanner;

public class zad7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			int num = input.nextInt();
			
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println("Max num is: " + max);
	}
}
