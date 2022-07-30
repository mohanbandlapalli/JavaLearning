package equals;
public class Main {
    int x = 10;
    static int y = 10;
    public static void main(String[] args) {
        Main main = new Main();

        Main.change1();
        System.out.println(main.x);
        System.out.println(y);

        main.change2();
        System.out.println(main.x);
        System.out.println(y);

    }
    public static void change1(){
        Main main = new Main();
        main.x = 20;


        y = 20;
    }
    public void change2(){
        x = 30;
        y = 30;

    }
}
