package oop;

public class Monkey extends Animal {
    public String foodType;

    public Monkey(int age, double weight, String foodType) {
        super(age, weight);
        this.foodType = foodType;
    }

    @Override
    public void eatFood() {
        System.out.println("This monkey loves " + foodType);
    }

}
