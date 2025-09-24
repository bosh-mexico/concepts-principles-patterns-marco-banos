package src.main.java.services;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringServiceImpl implements FilteringService {

    public List<String> Filter(List<String> list) {
        // Filtering with first char
        List<String> result = list.stream()
                .filter(s -> !s.isEmpty() && s.charAt(0) == 'M')
                .collect(Collectors.toList());

        return result;
    }
}
