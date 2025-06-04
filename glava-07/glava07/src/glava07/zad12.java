package glava07;

import java.util.Scanner;

public class zad12 {
	public static void main(String[] args) {
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) alphabet[i] = (char) ('a' + i);

        Scanner sc = new Scanner(System.in);
        System.out.print("Въведи дума: ");
        String word = sc.next().toLowerCase();

        for (char c : word.toCharArray()) {
            int index = c - 'a';
            System.out.println(c + " -> " + index);
        }
    }
}
