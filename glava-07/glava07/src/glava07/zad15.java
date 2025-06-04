package glava07;

import java.util.Arrays;

public class zad15 {
	public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
            }
        }
        int tmp = arr[i];
        arr[i] = arr[high];
        arr[high] = tmp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Сортиран: " + Arrays.toString(arr));
    }
}
