package glava07;

import java.util.Arrays;

public class zad05 {
	public static void main(String[] args) {
        int[] arr = {3, 2, 3, 4, 2, 2, 4};
        System.out.println(Arrays.toString(findLongestIncreasingSubsequence(arr)));
    }

    public static int[] findLongestIncreasingSubsequence(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        int[] longest = new int[0];
        int[] current = new int[arr.length];
        int currentLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] > arr[i - 1]) {
                current[currentLength++] = arr[i];
            } else {
                if (currentLength > longest.length) {
                    longest = Arrays.copyOf(current, currentLength);
                }
                current = new int[arr.length];
                current[0] = arr[i];
                currentLength = 1;
            }
        }

        if (currentLength > longest.length) {
            longest = Arrays.copyOf(current, currentLength);
        }

        return longest;
    }
}
