package Lab1;

import java.util.Scanner;

/**
 * Created by Owner on 1/16/2017.
 */
public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the width and height of the rectangle: ");
        double w = in.nextInt();
        double h = in.nextInt();

        r1 = new Rectangle(h, w);

        System.out.println(r1);
        System.out.println("Area:\t\t" + r1.getArea());
        System.out.println("Perimeter:\t" + r1.getPerimeter());
    }

    private static class Rectangle {
        private double height, width;

        public Rectangle() {
            height = width = 0;
        }
        public Rectangle(double h, double w) {
            height = h;
            width = w;
        }

        public double getArea() {
            return height*width;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        @Override
        public String toString() {
            String msg = "";
            msg += "Rectangle:\t[Width: " + width + ", Height: " + height + "]";
            return msg;
        }
    }
}
