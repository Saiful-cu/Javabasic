package oop;

public class Donkey extends Animal {
    private String name;

    public Donkey(int age, double weight, String name) {
        super(age, weight);

        this.name = name;
    }

    @Override
    public void printInfo() {
        String donkeyWithName = String.format("Donkey with name {name} : age{age}, weight{weight}", name, age, weight);
        System.out.println(donkeyWithName);
    }
}
