package org.example;

public class IfElseCondition {
    public void evenOdd(int number){
        if(number%2 == 0){
            System.out.println(number+ ": the number is even ");
        }
        else System.out.println(number+": the number is Odd");
    }
    public void positiveOrNegativeOrZero(int number){
        if(number>0) System.out.println(number+ ": the number is Positive");
        else if(number<0) System.out.println(number+ ": the number is Negative");
        else System.out.println(number+ ": the number is Zero");
    }
    public char gradeAssign(int marks){
        if(marks>= 90)return 'A';
        else if(marks >= 80)return 'B';
        else if(marks>= 70) return 'C';
        else if(marks >= 60) return 'D';
        else return 'F';
    }
}
