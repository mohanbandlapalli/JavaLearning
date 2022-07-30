package array;

import java.text.NumberFormat;
import java.util.*;


public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;


    public static void main(String[] args) {


        int principal = (int) readNumber("Enter Principal", 1000, 1000000);
        double annualInterest = readNumber("Enter AnnualInterest", 1, 30);
        int years = (int) readNumber("Enter years", 1, 20);

        printMortgage(principal, annualInterest, years);

        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("________________");
        for (short month =1; month<=years*MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));

        }

    }

    private static void printMortgage(int principal, double annualInterest, int years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("________");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }


    public static double readNumber(String text, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double number;
        while (true) {
            System.out.print(text);
            number = scanner.nextDouble();
            if (number >= min && number <= max) break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return number;
    }

    public static double calculateMortgage(int principal, double annualInterest, int years) {

        double monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;

    }

    public static double calculateBalance(int principal, double annualInterest, int years, short numberOfPaymentsMade) {
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        double numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;

    }

}

