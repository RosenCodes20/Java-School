package glava06;

import java.math.BigInteger;
import java.util.Scanner;

public class zad9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        BigInteger twoNFact = factorial(2 * n);
        BigInteger nPlus1Fact = factorial(n + 1);
        BigInteger nFact = factorial(n);

        BigInteger catalan = twoNFact.divide(nPlus1Fact.multiply(nFact));
        System.out.println("Catalan(" + n + ") = " + catalan);
    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
