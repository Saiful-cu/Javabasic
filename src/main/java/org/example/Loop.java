package org.example;

public class Loop {
    public void printNumber(int number){
        for(int i=1;i<= number;i++){
            System.out.println(i);
        }
    }
    public void printEvenNumber(int number){
        for(int i=1;i<= number;i++){
            if(i%2 ==0) System.out.println(i);
        }
    }
    public int reverse(int number){
        int reverseNumber =0;
        while(number!=0){
            reverseNumber = (reverseNumber*10) + number%10;
            number = number/10;
        }
       //System.out.println("reverse Number " + reverseNumber);
        return reverseNumber;
    }
    public int sumOfDigit(int number){
        int sum =0;
        while(number!=0){
            sum += number%10;
            number = number/10;
        }
        //System.out.println("Sum of Number " + sum);
        return sum;
    }
    public int doWhileSum(){

    }
}
