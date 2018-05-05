package uebung2.aufgabe1.a;

public class Main {

    public static long factorial(long n) {
        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    public static void main(String... args) {
        long result = factorial(4);
    }

}
