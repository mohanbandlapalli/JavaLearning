package com.mywork;

public class Array1 {

    public static void main(String[] args) {

        int[] x = {-9,-7876,-76656,-7876,-7878,-7877, 8, 7, 1, -1, 2, 3, -994};
        int min = x[0];

        for (int i = 0; i < x.length; i++) {
            if (min > x[i])
                min = x[i];

        }

        System.out.println("min = " +min);

        int min2 = x[0];
        for (int j = 0; j < x.length; j++) {
            if (min == x[j])
                continue;
            else if  (min2 > x[j])
                      min2 = x[j];
        }
        System.out.println("min2 = "+min2);
    }
}
