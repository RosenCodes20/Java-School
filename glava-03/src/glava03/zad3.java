package glava03;

public class zad3 {
	public static void main (String[] args) {
		String n = "237";
		
		boolean isThirdSeven = false;
		
		char thirdChar = n.charAt(2);
		
		if (thirdChar == '7') {
			isThirdSeven = true;
		}
		
		System.out.println(isThirdSeven);
	}
}
