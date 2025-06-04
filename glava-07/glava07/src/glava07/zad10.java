package glava07;

import java.util.Scanner;

public class zad10 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер на матрицата (n): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int value = 1;

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = value++;
            }
        }

        for (int[] row : matrix) {
            for (int el : row) System.out.printf("%4d", el);
            System.out.println();
        }
    }
}
