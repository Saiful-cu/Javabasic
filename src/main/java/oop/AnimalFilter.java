package oop;

import java.util.List;
import java.util.stream.Collectors;

public class AnimalFilter {
    public static List<Animal> filterByAge(List<Animal> animals, int minAge) {
        return animals.stream().filter(a -> a.age > minAge).collect(Collectors.toList());

    }
}
