package glava06;

import java.util.Scanner;

public class zad14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();

        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Шестнайсетично: " + hex);
    }
}
