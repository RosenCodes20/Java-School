package glava06;

import java.util.Scanner;

public class zad03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int highestNum = Integer.MIN_VALUE;
		int lowestNum = Integer.MAX_VALUE;
		
		for (int i = 1; i <= n; i++) {
			if (i > highestNum) {
				highestNum = i;
			} 
			
			if (i < lowestNum) {
				lowestNum = i;
			}
		}
		
		System.out.println("Highest Num: " + highestNum);
		System.out.println("Lowest Num: " + lowestNum);
	}
}
