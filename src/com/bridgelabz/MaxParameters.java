package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

public class MaxParameters<T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<T>();
    MaxParameters(T... inputs) {

        for (T value : inputs) {
            this.list.add(value);
        }
    }
    public T testMaximum() {
        return MaxParameters.testMaximum(list);
    }

    public static <T extends Comparable<T>> T testMaximum(ArrayList<T> list) {

        Collections.sort(list);

        T maxValue = list.get(list.size() - 1);
        System.out.println("Maximum : " + maxValue);
        return maxValue;
    }

    public static void main(String[] args) {

        Integer intValue1 = 100, intValue2 = 200, intValue3 = 300, intValue4 = 400;
        Float floatValue1 = 6.6f, floatValue2 = 7.7f, floatValue3 = 8.8f, floatValue4 = 9.9f;
        String stringValue1 = "Banana", stringValue2 = "Apple", stringValue3 = "Peach", stringValue4 = "Mango";

        new MaxParameters(intValue1, intValue2, intValue3, intValue4).testMaximum();
        new MaxParameters(floatValue1, floatValue2, floatValue3, floatValue4).testMaximum();
        new MaxParameters(stringValue1, stringValue2, stringValue3, stringValue4).testMaximum();
    }
}