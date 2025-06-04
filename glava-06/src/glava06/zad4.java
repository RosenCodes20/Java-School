package glava06;

public class zad4 {
	public static void main(String[] args) {
		String cardType = "";
		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= 14; j++) {
				if (i == 1) {
					cardType = "Karo";
				} else if (i == 2) {
					cardType = "Kupa";
				} else if (i == 3) {
					cardType = "Pika";
				} else if (i == 4) {
					cardType = "Spatiq";
				}
				
				if (j == 11) {
					String k = (String) ("J");
					System.out.println(k + " " + cardType);
					continue;
				}
				
				if (j == 12) {
					String k = (String) ("Q");
					System.out.println(k + " " + cardType);
					continue;
				}
				
				if (j == 13) {
					String k = (String) ("K");
					System.out.println(k + " " + cardType);
					continue;
				}
				
				if (j == 14) {
					String k = (String) ("A");
					System.out.println(k + " " + cardType);
					continue;
				}
				
				System.out.println(j + " " + cardType);
			}
		}
	}
}
