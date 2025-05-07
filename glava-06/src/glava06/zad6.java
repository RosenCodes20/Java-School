package glava06;

import java.util.Scanner;

public class zad6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int k = s.nextInt();
		
		int factorial = 1;
		
		for (int i = n; i <= k; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}
}
