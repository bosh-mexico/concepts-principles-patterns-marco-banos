package src.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList(
                "Bosch", "Mexico", "Mango", "Mark", "Blr", "Clean code"));

        // Filtering
        List<String> result = names.stream()
                .filter(s -> s.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
