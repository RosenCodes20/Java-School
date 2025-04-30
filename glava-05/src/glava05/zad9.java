package glava05;

import java.util.Scanner;

public class zad9 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		
		if (number < 0 || number > 999) {
            System.out.println("Невалидно число");
        }

        if (number == 0) {
        	System.out.println("Нула");
        }

        int h = number / 100;
        int t = (number % 100) / 10;
        int u = number % 10;

        String result = "";

        switch (h) {
            case 1: result += "сто"; break;
            case 2: result += "двеста"; break;
            case 3: result += "триста"; break;
            case 4: result += "четиристотин"; break;
            case 5: result += "петстотин"; break;
            case 6: result += "шестстотин"; break;
            case 7: result += "седемстотин"; break;
            case 8: result += "осемстотин"; break;
            case 9: result += "деветстотин"; break;
        }

        if (t == 1) {
            switch (u) {
                case 0: result += " десет"; break;
                case 1: result += " единадесет"; break;
                case 2: result += " дванадесет"; break;
                case 3: result += " тринадесет"; break;
                case 4: result += " четиринадесет"; break;
                case 5: result += " петнадесет"; break;
                case 6: result += " шестнадесет"; break;
                case 7: result += " седемнадесет"; break;
                case 8: result += " осемнадесет"; break;
                case 9: result += " деветнадесет"; break;
            }
        } else {
            switch (t) {
                case 2: result += " двадесет"; break;
                case 3: result += " тридесет"; break;
                case 4: result += " четиридесет"; break;
                case 5: result += " петдесет"; break;
                case 6: result += " шестдесет"; break;
                case 7: result += " седемдесет"; break;
                case 8: result += " осемдесет"; break;
                case 9: result += " деветдесет"; break;
            }

            if (t != 1 && u != 0) {
                result += " и ";
                switch (u) {
                    case 1: result += "едно"; break;
                    case 2: result += "две"; break;
                    case 3: result += "три"; break;
                    case 4: result += "четири"; break;
                    case 5: result += "пет"; break;
                    case 6: result += "шест"; break;
                    case 7: result += "седем"; break;
                    case 8: result += "осем"; break;
                    case 9: result += "девет"; break;
                }
            }
        }
        
        System.out.println(result);
	}
}
