package com.mywork;
public class Calculator {
  public static   int num1;
  public  int num2;
    public Calculator (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        printResult();
    }
    public Calculator (){
    }
    public int add(){
        return this.num1+this.num2;
    }
    public int subtract(){
        return this.num1-this.num2;
    }
    public int multiply(){
        return this.num1*this.num2;
    }
    public int divide(){ return this.num1/this.num2; }
    public void printResult(){
        System.out.print("add: "+add()+", ");
        System.out.print("subtract: "+subtract()+", ");
        System.out.print("multiply: "+multiply()+ ", ");
        System.out.println("divide: "+divide());

    }
}