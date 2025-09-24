package src;

import src.main.java.services.FilteringService;
import src.main.java.services.FilteringServiceImpl;
import src.main.java.utils.FilteringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static src.main.java.utils.FilteringUtils.isPrime;

public class Main {
    public static void main(String[] args) {

        FilteringService sss = new FilteringServiceImpl();

        // Test with Strings starting with 'M' (ignoreCase)
        List<String> names = new ArrayList<>(Arrays.asList("Bosch", "Mexico", "Mango", "Mark", "Blr", "Clean code"));
        System.out.println("Strings starting with 'M': " + sss.Filter(names));

        // Fast test with prime numbers
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> primes = sss.Filter(numbers, isPrime);
        System.out.println("Prime numbers: " + primes);

    }
}
