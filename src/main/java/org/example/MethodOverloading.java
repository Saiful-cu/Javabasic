package org.example;

public class MethodOverloading {
    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    public int multiple(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public double multiple(double num1, double num2) {
        return num1 * num2;
    }
}
