package src;

import src.main.java.services.FilteringService;
import src.main.java.services.FilteringServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        FilteringService sss = new FilteringServiceImpl();


        // Prueba con Strings que empiezan con 'M' (ignoreCase)
        List<String> names = new ArrayList<>(Arrays.asList(
                "Bosch", "Mexico", "Mango", "Mark", "Blr", "Clean code"));
        System.out.println("Strings starting with 'M': " + sss.Filter(names));

        // Prueba rápida con números primos
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        List<Integer> primes = sss.Filter(numbers, isPrime);
        System.out.println("Prime numbers: " + primes);

    }
}
