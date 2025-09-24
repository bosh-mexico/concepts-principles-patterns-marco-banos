package src.main.java.services;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilteringServiceImpl implements FilteringService {

    @Override
    public List<String> Filter(List<String> list) {
        // Filtering with first char
        List<String> result = list.stream()
                .filter(s -> !s.isEmpty() && Character.toUpperCase(s.charAt(0)) == 'M')
                .collect(Collectors.toList());

        return result;
    }

    @Override
    public <T> List<T> Filter(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }


}
