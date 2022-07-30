package com.mywork;

public class MainStaticCheck {
    public static void main(String[] args) {
        StaticCheck staticCheck1 = new StaticCheck();
        StaticCheck staticCheck2 = new StaticCheck();
        StaticCheck staticCheck3 = new StaticCheck();

        System.out.println(staticCheck2.x);
        System.out.println(StaticCheck.staticX);

    }

}
