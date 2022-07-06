package com.mywork;

public class Mortgage{

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculate = new MortgageCalculate(principal, annualInterest, years);
        new MortgageReport(calculate).printMortgage();
        new MortgageReport(calculate).printPaymentSchedule();

    }


}
