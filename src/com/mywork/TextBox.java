package com.mywork;

public class TextBox {

    public String text;
    public static int x=10;

    public static String setText (String text){
        var textBox = new TextBox();
        System.out.println(text);
       return textBox.text = text;
    }

    public static  void  clearText(){
        var textBox = new TextBox();
        textBox.text = "";

    }

    public void setX(int x){
        this.x=x;
    }


}
