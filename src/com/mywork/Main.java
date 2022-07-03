package com.mywork;

public class Main {


    public static void main(String[] args) {
        Employee employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(20);
        System.out.println("wage = " + wage);
    }

}
