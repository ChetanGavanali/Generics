package com.bridgelabz;

public class MaxInteger {

    public static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
        Integer maximumNumber;

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

        Integer firstNumber = 1, secondNumber = 2, thirdNumber = 3;
        findMaximum(firstNumber, secondNumber, thirdNumber);

    }
}