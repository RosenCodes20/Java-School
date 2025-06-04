package glava06;

import java.util.Scanner;

public class zad5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
	}
}
