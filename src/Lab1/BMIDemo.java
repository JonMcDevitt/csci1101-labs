package Lab1;

import java.util.Scanner;

/**
 * Created by Owner on 1/16/2017.
 */
public class BMIDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a name: ");
        String name = in.nextLine();
        System.out.print("\nPlease enter an age: ");
        int age = in.nextInt();
        System.out.print("\nPlease enter the weight (in pounds): ");
        double weight = in.nextDouble();
        System.out.print("\nPlease enter the height (in inches): ");
        double height = in.nextDouble();

        if(age < 20) {
            System.out.println("Age must be at least 20 to calculate an accurate BMI.");
            System.exit(0);
        }

        System.out.println(new Person(name, age, weight, height));
    }
}
