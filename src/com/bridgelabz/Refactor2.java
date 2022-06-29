package com.bridgelabz;

    public class Refactor2<T extends Comparable<T>> {
        T input1, input2, input3;

        Refactor2(T input1, T input2, T input3) {
            this.input1 = input1;
            this.input2 = input2;
            this.input3 = input3;
        }

        public T testMaximum() {
            return Refactor2.testMaximum(input1, input2, input3);
        }

        public static <T extends Comparable<T>> T testMaximum(T input1, T input2, T input3) {

            T maxValue = input1;
            if (input2.compareTo(maxValue) > 0) {
                maxValue = input2;
            }
            if (input3.compareTo(maxValue) > 0) {
                maxValue = input3;
            }

            showMaxValue(input1, input2, input3, maxValue);
            return maxValue;
        }

        public static <T> void showMaxValue(T input1, T input2, T input3, T maxValue) {

            System.out.println("\nNumber1 : " + input1 + "\nNumber2 : " + input2 + "\nNumber3 : " + input3);
            System.out.println("Maximum : " + maxValue);
        }

        public static void main(String[] args) {

            Integer intValue1 = 3, intValue2 = 2, intValue3 = 1;
            Float floatValue1 = 8.8f, floatValue2 = 7.7f, floatValue3 = 6.6f;
            String stringValue1 = "Banana", stringValue2 = "Apple", stringValue3 = "Peach";

            new Refactor2(intValue1, intValue2, intValue3).testMaximum();
            new Refactor2(floatValue1, floatValue2, floatValue3).testMaximum();
            new Refactor2(stringValue1, stringValue2, stringValue3).testMaximum();
        }
    }
