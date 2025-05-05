package oop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(25, 70.01));
        animals.add(new Animal(25, 72.25));
        animals.add(new Animal(125, 70.20));
        animals.add(new Monkey(125, 70.10, "Banana"));
        animals.add(new Monkey(7, 25.250, "Bamboo"));
        animals.add(new Donkey(7, 250.21, "Donny"));
        animals.add(new Donkey(7, 25.05, "Little"));


        Zoo zoo = new Zoo("New York", animals);
        zoo.printAnimal();
        List<Animal> filteredAnimals = AnimalFilter.filterByAge(animals, 20);
        Zoo filteredZoo = new Zoo("new City", filteredAnimals);

        filteredZoo.printAnimal();

        List<Zoo> zoos = new ArrayList<>();
        zoos.add(zoo);

        zoos.add(filteredZoo);
        zoos.stream().filter(z -> z.getCity().toLowerCase().contains("new")).forEach(Zoo::printAnimal);
    }
}
