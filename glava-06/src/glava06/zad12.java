package glava06;

import java.util.Scanner;

public class zad12 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int decimal = scanner.nextInt();

	        String binary = Integer.toBinaryString(decimal);
	        System.out.println("Двоично: " + binary);
	 }
}
