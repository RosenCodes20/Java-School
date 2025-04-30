package glava05;

public class zad1 {
	public static void main(String[] args) {
		int a = 7;
		
		int b = 6;
		
		if (a > b) {
			int c = b;
			b = a;
			a = c;
			
			System.out.println("a: " + a + " b: " + b);
		}
	}
}
