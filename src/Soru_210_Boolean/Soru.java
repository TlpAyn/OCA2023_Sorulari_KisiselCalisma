package Soru_210_Boolean;

import java.util.function.Predicate;

public class Soru {
    public static void main(String[] args) {
        Predicate <Integer> p = (n) -> n % 2 == 0;

        Boolean s = p.test(100);
        System.out.println("s = " + s);
    }
}
