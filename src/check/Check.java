package check;

public class Check {

    public static void printNum(int n){
        if (n==0) {
            return;
        }
        System.out.println(n+" top ");
        printNum(n-1);
        System.out.println(n+" bottom ");
    }


    public static void main(String[] args) {
        if(args.length == 1) {
            return;
        }
        printNum(6);
    }

    public static void reverseArrayInMemory(int[] array) {

    }
}