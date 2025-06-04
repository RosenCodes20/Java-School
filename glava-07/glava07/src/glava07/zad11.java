package glava07;

import java.util.Scanner;

public class zad11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                mat[i][j] = sc.nextInt();

        int maxSum = Integer.MIN_VALUE, maxRow = 0, maxCol = 0;

        for (int i = 0; i <= n - 3; i++) {
            for (int j = 0; j <= m - 3; j++) {
                int sum = 0;
                for (int r = i; r < i + 3; r++)
                    for (int c = j; c < j + 3; c++)
                        sum += mat[r][c];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Максимална подматрица 3x3:");
        for (int i = maxRow; i < maxRow + 3; i++) {
            for (int j = maxCol; j < maxCol + 3; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        System.out.println("Сума: " + maxSum);
    }
}
