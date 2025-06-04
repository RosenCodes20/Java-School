package glava07;

public class zad16 {
	  public static void main(String[] args) {
	        int limit = 10_000_000;
	        boolean[] isPrime = new boolean[limit + 1];
	        for (int i = 2; i <= limit; i++) isPrime[i] = true;

	        for (int i = 2; i * i <= limit; i++) {
	            if (isPrime[i]) {
	                for (int j = i * 2; j <= limit; j += i) isPrime[j] = false;
	            }
	        }

	        for (int i = 2; i <= limit; i++) {
	            if (isPrime[i]) System.out.print(i + " ");
	        }
	    }
}
