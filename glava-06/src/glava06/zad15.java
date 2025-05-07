package glava06;

import java.util.Scanner;

public class zad15 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String hex = scanner.nextLine();

	        int decimal = Integer.parseInt(hex, 16);
	        System.out.println("Десетично: " + decimal);
	 }
}
