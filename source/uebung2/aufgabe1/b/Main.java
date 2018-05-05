package uebung2.aufgabe1.b;

import static uebung2.aufgabe1.a.Main.factorial;

public class Main {

    public static long choose(long n, long k) {
        if (n < 0 || k < 0) System.out.println("idiot");
        if (n < k) return 0;
        /* k <= n */
        else return factorial(n) / factorial(k) * factorial(n - k);
    }

    public static void main(String... args) {
        long result = choose(10, 4);
    }

}
