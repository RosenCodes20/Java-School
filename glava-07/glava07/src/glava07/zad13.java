package glava07;

import java.util.Scanner;

public class zad13 {
	public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Търси число: ");
        int target = sc.nextInt();

        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Намерен на позиция: " + mid);
                return;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        System.out.println("Числото не е намерено.");
    }
}
