package glava07;

public class zad03 {
	 public static void main(String[] args) {
	        char[] array1 = {'a', 'b', 'c'};
	        char[] array2 = {'a', 'b', 'd'};
	        
	        int result = compareArrays(array1, array2);
	        
	        if (result < 0) {
	            System.out.println("Масив 1 е лексикографски по-рано.");
	        } else if (result > 0) {
	            System.out.println("Масив 2 е лексикографски по-рано.");
	        } else {
	            System.out.println("Масивите са идентични.");
	        }
	    }
	    
	    public static int compareArrays(char[] array1, char[] array2) {
	        int minLength = Math.min(array1.length, array2.length);
	        
	        for (int i = 0; i < minLength; i++) {
	            if (array1[i] < array2[i]) {
	                return -1;
	            } else if (array1[i] > array2[i]) {
	                return 1;
	            }
	        }
	        
	        if (array1.length < array2.length) {
	            return -1;
	        } else if (array1.length > array2.length) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
}
