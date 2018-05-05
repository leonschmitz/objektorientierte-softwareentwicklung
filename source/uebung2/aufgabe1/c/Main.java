package uebung2.aufgabe1.c;

import static uebung2.aufgabe1.a.Main.factorial;
import static uebung2.aufgabe1.b.Main.choose;

public class Main {

    private static long lotto(long n, long k) {
        return choose(n, k) * factorial(k);
    }

    public static void main(String... args) {
        long result = lotto(10, 4);
    }

}
