package glava06;

import java.math.BigInteger;
import java.util.Scanner;

public class zad7 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Въведете N: ");
	        int n = scanner.nextInt();
	        System.out.print("Въведете K: ");
	        int k = scanner.nextInt();

	        if (k > n || n < 0 || k < 0) {
	            System.out.println("Невалидни стойности за N и K.");
	            return;
	        }

	        BigInteger nFact = factorial(n);
	        BigInteger kFact = factorial(k);
	        BigInteger nMinusKFact = factorial(n - k);

	        BigInteger result = nFact.multiply(kFact).divide(nMinusKFact);
	        System.out.println("Резултатът е: " + result);
	    }

	    public static BigInteger factorial(int num) {
	        BigInteger result = BigInteger.ONE;
	        for (int i = 2; i <= num; i++) {
	            result = result.multiply(BigInteger.valueOf(i));
	        }
	        return result;
	    }
}
