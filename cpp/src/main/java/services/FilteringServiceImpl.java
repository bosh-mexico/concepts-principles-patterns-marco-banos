package src.main.java.services;

import java.util.List;
import java.util.stream.Collectors;

public class FilteringServiceImpl implements FilteringService {

    public List<String> Filter(List<String> list) {
        // Filtering
        List<String> result = list.stream()
                .filter(s -> s.startsWith("M"))
                .collect(Collectors.toList());

        return result;
    }
}
