package glava05;

public class zad7 {
	public static void main(String[] args) {
		int a = -2, b = -1, c = 3;
		
		if (a + b == 0) {
			System.out.println("Подмножество!");
		} else if (b + c == 0) {
			System.out.println("Подмножество!");
		} else if (a + c == 0) {
			System.out.println("Подмножество!");
		} else if (a == 0) {
			System.out.println("Подмножество!");
		} else if (b == 0) {
			System.out.println("Подмножество!");
		} else if (c == 0) {
			System.out.println("Подмножество!");
		} else {
			System.out.println("Няма подмножество!");
		}
	}
}
