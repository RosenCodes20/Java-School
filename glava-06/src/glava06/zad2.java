package glava06;

import java.util.Scanner;

public class zad2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
	}
}
