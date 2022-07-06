package com.mywork;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {
        int[] array1 = {4, 3, 2, 1};
        int secondMax = findSecondMax(array1);
        System.out.println(secondMax);
        int[] array2 = {1, 2, 3, 4, 5};
        secondMax = findSecondMax(array2);
        System.out.println(secondMax);
        int[] array3 = {1, 2};
        secondMax = findSecondMax(array3);
        System.out.println(secondMax);

        int[] array4 = {1};
        try {
            secondMax = findSecondMax(array4);
            System.out.println(secondMax);
        } catch (IllegalArgumentException exception) {
            System.out.println("invalid array:"+ Arrays.toString(array4));
        }

        int[] array5 = {1, 2, 3};
        try {
            secondMax = findSecondMax(array5);
            System.out.println(secondMax);
        } catch (IllegalArgumentException exception) {
            System.out.println("invalid array:"+ Arrays.toString(array4));
        }
    }

    /**
     * @param array: integer array whose size is greater than 2 or equals to 2
     * @return : second maximum integer in the array
     * @throw : IllegalArgumentException if array length is not greater than 2 or equals to 2
     */



    private static int findSecondMax(int[] array) {
        if(array.length < 2) {
            throw new IllegalArgumentException("array length must be greater than 2 or equals to 2");
        }
        int max;
        int secMax;

        if (array[0] > array[1]) {
            max = array[0];
            secMax = array[1];
        } else {
            max = array[1];
            secMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if(array[i] > max) {
                secMax = max;
                max = array[i];
            } else if (array[i] > secMax) {
                secMax = array[i];
            }
        }
        return  secMax;
    }
}
