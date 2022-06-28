package com.bridgelabz;

public class MaxFloat {
    public static void findMaximum(Float firstNumber, Float secondNumber, Float thirdNumber) {
        Float maximumNumber;

        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = firstNumber;
        } else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
            maximumNumber = secondNumber;
        } else {
            maximumNumber = thirdNumber;
        }

        System.out.println("The maximum number is: " + maximumNumber);
    }

    public static void main(String[] args) {

        Float number1 = 6.6f, number2 = 7.7f, number3 = 8.8f;
        findMaximum(number1, number2, number3);
    }
}