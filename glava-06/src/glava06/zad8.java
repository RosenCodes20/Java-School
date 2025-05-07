package glava06;

import java.util.Scanner;

public class zad8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double sum = 1.0;
        double factorial = 1.0;

        for (int i = 2; i <= N; i++) {
            factorial *= i;
            sum += 1.0 / factorial;
        }

        System.out.printf("Сумата е: %.5f%n", sum);
    }
}
