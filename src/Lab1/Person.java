package Lab1;

/**
 * Created by Owner on 1/16/2017.
 */
public class Person {
    private String name;
    private int age;
    private double weight, height;

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calcBMI() {
        return 703 * weight / (height*height);
    }

    public String interpretBMI() {
        double BMI = calcBMI();
        String op = "BMI:\t" + BMI;
        if(BMI < 18.5) {
            op += "\n" + name + " is underweight.";
        } else if(BMI < 25.0) {
            op += "\n" + name + " is normal.";
        } else if(BMI < 30.0) {
            op += "\n" + name + " is overweight.";
        } else {
            op += "\n" + name + " is obese.";
        }
        return op;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "Name:\t" + name;
        msg += "\nAge:\t" + age;
        msg += "\n" + interpretBMI();
        return msg;
    }
}
