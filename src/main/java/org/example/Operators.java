package org.example;

public class Operators {
    public int addition(int num1, int num2){
        return num1+num2;
    }
    public int subtraction(int num1, int num2){
        return num1-num2;
    }
    public int multiplication(int num1, int num2){
        return num1*num2;
    }
    public int division(int num1, int num2){
        return num1/num2;
    }
    public int modulus(int num1, int num2){
        return num1+num2;
    }
    public void displayOperators(int num1, int num2){
        System.out.println("Addition of two numbers : "+ addition(num1,num2));
        System.out.println("Subtraction of two numbers : "+ subtraction(num1,num2));
        System.out.println("Multiplication of two numbers : "+ multiplication(num1,num2));
        System.out.println("Division of two numbers : "+ division(num1,num2));
        System.out.println("Modulus of two numbers : "+ modulus(num1,num2));

    }
}
