package glava06;

import java.util.Random;
import java.util.Scanner;

public class zad16 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Въведете число N: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("N трябва да е положително число.");
	            return;
	        }

	        Random rand = new Random();
	        int randomNumber = rand.nextInt(n) + 1;
	        System.out.println("Случайно число: " + randomNumber);
	    }
}
