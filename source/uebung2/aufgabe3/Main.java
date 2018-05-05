package uebung2.aufgabe3;

public class Main {

    private static Integer gcd(Integer a, Integer b) {
        if (a.equals(0)) return b;
        while (!b.equals(0)) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public static void main(String... args) {
        final Integer gcd = gcd(5, 3);
    }

}
