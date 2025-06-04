package glava07;

import java.util.Scanner;

public class zad9 {
	   public static void main(String[] args) {
	        int[] arr = {4, 3, 1, 4, 2, 5, 8};
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Въведи сума S: ");
	        int S = sc.nextInt();

	        for (int i = 0; i < arr.length; i++) {
	            int sum = 0;
	            for (int j = i; j < arr.length; j++) {
	                sum += arr[j];
	                if (sum == S) {
	                    for (int k = i; k <= j; k++) System.out.print(arr[k] + " ");
	                    return;
	                }
	            }
	        }

	        System.out.println("Няма такава последователност.");
	    }
}
