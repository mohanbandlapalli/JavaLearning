package lambda;

public class LambdasDemo {

    public static void main(String[] args) {
        greet(new Printer() {
            @Override
            public void print(String message) {

            }
        });

    }
    public static void show(){
        greet(new ConsolePrinter());

    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }

}
