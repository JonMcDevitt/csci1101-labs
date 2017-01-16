package Lab1;

import java.util.Scanner;

/**
 * Created by Owner on 1/16/2017.
 */
public class CarDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double capacity, consump;

        System.out.print("Enter the capacity (in litres): ");
        capacity = in.nextDouble();

        System.out.print("\nEnter the consumption rate (in litres/kilometer): ");
        consump = in.nextDouble();
        Car c1 = new Car(capacity, consump);

        System.out.print("\nEnter the amount of gas to fill: ");
        c1.fill(in.nextDouble());
        System.out.print("\nEnter the distance you would like to drive: ");
        c1.drive(in.nextDouble());
    }
}
