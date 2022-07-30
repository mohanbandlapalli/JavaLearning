package check;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] x = {1,2};
        int[] z = reverseArrayWithExtraMemory(x);
//        System.out.println(Arrays.toString(z));
        reverseArrayInMemory(x);
        System.out.println(Arrays.toString(x));
    }

    public static int[] reverseArrayWithExtraMemory(int[] array) {
        int[] reversedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            reversedArray[i] = array[array.length-i-1];
        }
        return reversedArray;
    }

    public static void reverseArrayInMemory(int[] array) {
        if(array == null) return;
        for(int i=0; i<array.length/2; i++) {
            swap(array, i, array.length- i -1);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //0, 1, 2, 3, 4, 5
    //0, 1, 2, 3, 4
}

