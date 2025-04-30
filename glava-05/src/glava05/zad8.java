package glava05;

import java.util.Scanner;

public class zad8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		if (num >= 1 && num <= 3) {
			num *= 10;
			System.out.println(num);
		} else if (num >= 4 && num <= 6) {
			num *= 100;
			System.out.println(num);
		} else if (num >= 7 && num <= 9) {
			num *= 1000;
			System.out.println(num);
		} else {
			System.out.println("Invalid!!");
			s.close();
		}
	}
}
