package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();
        Loop loop = new Loop();
        IfElseCondition ifElseCondition = new IfElseCondition();
        Operators operators = new Operators();
        BasicMethods basicMethods = new BasicMethods();
        MethodOverloading methodOverloading = new MethodOverloading();


//        variableDeclaration.printVariable();

//        operators.displayOperators(50, 10);

//        ifElseCondition.evenOdd(25);
//        ifElseCondition.positiveOrNegativeOrZero(-10);
//        System.out.println("The Student get the grade : "+ifElseCondition.gradeAssign(82));

//        loop.printNumber(1,20);
//        loop.printEvenNumber(1,50);
//        System.out.println("Reverse Number is : "+loop.reverse(12345));
//        System.out.println("Some of 1 to 100 sum: "+ loop.doWhileSum(1,100));

//        basicMethods.printMessage();
//        System.out.println("The sum is " + basicMethods.sum(4, 5));
//        if(basicMethods.isEven(45)) System.out.println("The number is Even");
//        else System.out.println("The number is not Even");
        System.out.println("Multiplication of two integer number: " + methodOverloading.multiple(10, 20));
        System.out.println("Multiplication of tree integer number: " + methodOverloading.multiple(10, 5, 4));
        System.out.println("Multiplication of two double number: " + methodOverloading.multiple(10.2, 25.1));

    }
}