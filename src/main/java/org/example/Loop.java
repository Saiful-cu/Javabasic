package org.example;

public class Loop {
    public void printNumber(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
    }

    public void printEvenNumber(int startNumber, int endNumber) {

        while (endNumber > startNumber)
            if (startNumber % 2 == 0)
                System.out.println(startNumber);
        startNumber++;
    }


    public int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + number % 10;
            number = number / 10;
        }
        //System.out.println("reverse Number " + reverseNumber);
        return reverseNumber;
    }

    public int sumOfDigit(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        //System.out.println("Sum of Number " + sum);
        return sum;
    }

    public int doWhileSum(int startNumber, int endNumber) {
        int sum = 0;
        do {
            sum += startNumber;
            startNumber++;
        } while (startNumber <= endNumber);
        return sum;
    }
}
