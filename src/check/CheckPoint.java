package check;

import java.awt.*;

public class CheckPoint {
    public static void main(String[] args) {
        Point x = new Point(5,6);
        Point y = x;
        Point z = new Point(6,7);
        y=z;
        System.out.println(y);
    }
}
