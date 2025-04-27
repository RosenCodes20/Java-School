package glava03;

public class zad11 {
    public static void main(String[] args) {
        int n = 35;
        int p = 5;

        int bitValue = (n >> p) & 1;

        System.out.println("The value of bit at position " + p + " is: " + bitValue);
    }
}