package src;

import src.main.java.services.FilteringService;
import src.main.java.services.FilteringServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FilteringService sss = new FilteringServiceImpl();

        List<String> names = new ArrayList<>(Arrays.asList(
                "Bosch", "Mexico", "Mango", "Mark", "Blr", "Clean code"));
        System.out.println(sss.Filter(names));
    }
}
