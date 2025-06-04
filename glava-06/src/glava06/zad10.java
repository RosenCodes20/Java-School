package glava06;

import java.util.Scanner;

public class zad10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int row = 1; row <= N; row++) {
            for (int col = row; col < row + N; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
