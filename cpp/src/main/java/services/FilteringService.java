package src.main.java.services;

import java.util.List;
import java.util.function.Predicate;

public interface FilteringService {

    List<String> Filter(List<String> list);
    <T> List<T> Filter(List<T> list, Predicate<T> predicate);
}
