package src.main.java.utils;

import java.util.function.Predicate;

public class FilteringUtils {

    public static final Predicate<Integer> isPrime = n -> {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    };

}
