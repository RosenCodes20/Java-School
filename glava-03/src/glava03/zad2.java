package glava03;

public class zad2 {
	public static void main (String[] args) {
		boolean isBySevenAndFive = false;
		
		int n = 35;
		
		if (n % 5 == 0 && n % 7 == 0) {
			isBySevenAndFive = true;
		}
		
		System.out.println(isBySevenAndFive);
	}
}
