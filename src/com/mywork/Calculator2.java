package com.mywork;

public class Calculator2 {
  public static int num1;
  public static int num2;

    public Calculator2(int num1, int num2){
        Calculator2.num1 = num1;
        Calculator2.num2 = num2;
        printResult();
    }

    public Calculator2(){

    }
    public static int add(){ return Calculator2.num1+Calculator2.num2; }
    public static int subtract(){
        return Calculator2.num1+Calculator2.num2;
    }
    public static int multiply(){
        return Calculator2.num1+Calculator2.num2;
    }

    public static void printResult(){
        System.out.print(add()+",");
        System.out.print(subtract()+",");
        System.out.println(multiply());

    }
}