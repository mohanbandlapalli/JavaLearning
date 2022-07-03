package com.mywork;

public class Employee {


    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary<=0)
            throw new IllegalArgumentException("Salary can't be 0 or negative");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }


    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<=0)
            throw new IllegalArgumentException("Salary can't be 0 or negative");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate*extraHours);
    }


}
