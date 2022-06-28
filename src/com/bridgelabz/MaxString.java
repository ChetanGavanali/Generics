package com.bridgelabz;

public class MaxString {

    public static void findMaximum(String firstNumber, String secondNumber, String thirdNumber) {
        String String;

        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0) {
            String = firstNumber;
        } else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0) {
            String = secondNumber;
        } else {
            String = thirdNumber;
        }

        System.out.println("The maximum String is: " + String);
    }

    public static void main(String[] args) {

        String String1 = "Apple", String2 = "Peach" , String3 = "Banana" ;
        findMaximum(String1, String2, String3);
    }
}