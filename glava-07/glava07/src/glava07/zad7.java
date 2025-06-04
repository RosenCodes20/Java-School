package glava07;

public class zad7 {
	public static void main(String[] args) {
		int[] arr = {1, 5, 6, 8, 4, 12, 15};
		
		int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
        int min_idx = i;

         for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

     
         int temp = arr[i];
         arr[i] = arr[min_idx];
         arr[min_idx] = temp; 
        }
        
        System.out.println(java.util.Arrays.toString(arr));
	}
}
