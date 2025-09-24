package src.test.java;

/*import org.junit.jupiter.api.Test;
import src.main.java.services.FilteringService;
import src.main.java.services.FilteringServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {

    private final FilteringService service = new FilteringServiceImpl();

    @Test
    void testFilterStringsStartingWithM() {
        List<String> input = Arrays.asList("Bosch", "Mexico", "Mango", "Mark", "Blr", "Clean code");
        List<String> expected = Arrays.asList("Mexico", "Mango", "Mark");

        List<String> result = service.Filter(input);

        assertEquals(expected, result);
    }

    @Test
    void testFilterWithEmptyStrings() {
        List<String> input = Arrays.asList("", "Mexico", "Mango", "");
        List<String> expected = Arrays.asList("Mexico", "Mango");

        List<String> result = service.Filter(input);

        assertEquals(expected, result);
    }

    @Test
    void testFilterWhenNoMatches() {
        List<String> input = Arrays.asList("Bosch", "Blr", "Clean code");
        List<String> expected = List.of();

        List<String> result = service.Filter(input);

        assertEquals(expected, result);
    }

    @Test
    void testFilterPrimesFromIntegerList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11);

        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };

        List<Integer> result = service.Filter(input, isPrime);

        assertEquals(expected, result);
    }
}*/