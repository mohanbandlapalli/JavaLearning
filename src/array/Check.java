package array;


import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter Input:");
        String name = scanner.nextLine();
        System.out.println(revBySwapping(name));
        System.out.println(name);
    }
    public static String revBySwapping(String string){
        char[] c = string.toCharArray();
        for (int i=0; i<=(c.length-1)/2; i++) {
            char temp = c[i];
            c[i] = c[(c.length - 1) - i];
            c[(c.length - 1) - i] = temp;
        }
        string = new String(c);
        return string;

    }
    public static String revByRecursion(String string){
        if (string.length() ==0)
            return "";
        return string.charAt((string.length()-1))+revByRecursion(string.substring(0,string.length()-1));
    }

    public static String rev(String string) {
        String reverse = "";
        for (int i = string.length()-1; i>=0; i--)
            reverse = reverse + string.charAt(i);
        return reverse;
    }

}