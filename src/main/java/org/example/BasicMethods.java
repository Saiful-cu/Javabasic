package org.example;

public class BasicMethods {
    public void printMessage() {
        System.out.println("Welcome to the Method");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
