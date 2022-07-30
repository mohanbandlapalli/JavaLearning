package check;

import java.util.Arrays;

public class PassByReferenceVsValue {


    public static void main(String[] args) {
        int[] x = {1,2};
        byValueChange(x);
        System.out.println(Arrays.toString(x));
    }

    public static void byValueChange(int[] array) {

        int[] z = {2, 3};
        array = z;
        System.out.println("1. " + Arrays.toString(array));

    }
}
