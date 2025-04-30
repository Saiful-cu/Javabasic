package oop;

import java.util.List;

public class Zoo {
    public String city;
    public List<Animal> animalList;

    Zoo(String city, List<Animal> animalList) {

        this.city = city;
        this.animalList = animalList;
    }

    public void printAnimal() {
        System.out.println("Let's feed animals in " + city + "zoo!");
        for (Animal animal : animalList) {
            animal.printInfo();
        }

    }

    public String getCity() {
        return city;
    }
}
