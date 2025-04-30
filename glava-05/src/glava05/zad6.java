package glava05;

import java.util.Scanner;

public class zad6 {
	public static void main(String[] args) {
		int biggestNum = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++) {
			Scanner s = new Scanner(System.in);
			
			int num = s.nextInt();
			
			if (num > biggestNum) {
				biggestNum = num;
			}
		}
		
		System.out.println("The biggest num is: " + biggestNum);
	}
}
