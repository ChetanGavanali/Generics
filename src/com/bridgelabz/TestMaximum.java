package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

public class TestMaximum<T extends Comparable<T>> {

        ArrayList<T> list = new ArrayList<T>();

        TestMaximum(T... inputs) {
            for (T value : inputs) {
                this.list.add(value);
            }
        }

        public T testMaximum() {
            return TestMaximum.testMaximum(list);
        }
        public static <T extends Comparable<T>> T testMaximum(ArrayList<T> list) {

            Collections.sort(list);

            T maxValue = list.get(list.size() - 1);
            showMaxValue(list, maxValue);
            return maxValue;
        }

        public static <T> void showMaxValue(ArrayList<T> list, T maxValue) {
            System.out.println("\nInput values : ");
            for (T value : list) {
                System.out.print(value + " , ");
            }
            System.out.println("\nMaximum : " + maxValue);
        }

        public static void main(String[] args) {

            Integer intValue1 = 100, intValue2 = 200, intValue3 = 300;
            Float floatValue1 = 6.6f, floatValue2 = 7.7f, floatValue3 = 8.8f;
            String stringValue1 = "Banana", stringValue2 = "Apple", stringValue3 = "Peach";

            new TestMaximum(intValue1, intValue2, intValue3).testMaximum();
            new TestMaximum(floatValue1, floatValue2, floatValue3).testMaximum();
            new TestMaximum(stringValue1, stringValue2, stringValue3).testMaximum();
        }
    }

