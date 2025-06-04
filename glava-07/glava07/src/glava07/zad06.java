package glava07;

import java.util.Scanner;

public class zad06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int k = s.nextInt();
		
		int[] myArray = new int [n];
		
		
		for (int i = 0; i < k; i++) {
			myArray[i] = i;
		}
		
		int sum = 0;
		
		for (int i : myArray) {
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
