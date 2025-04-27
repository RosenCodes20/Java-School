package glava03;

public class zad12 {
    public static void main(String[] args) {
        int n = 35;
        int p = 5;
        int v = 0;

        if (v == 1) {
            n = n | (1 << p);
        } else {
            n = n & ~(1 << p);
        }

        System.out.println("New value of n: " + n);
    }
}
