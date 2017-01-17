package Lab1;

/**
 * Created by Owner on 1/16/2017.
 */
public class Car {
    private double capacity, gasLevel, consumptionRate;

    public Car(double c, double cR) {
        gasLevel = 0;
        capacity = c;
        consumptionRate = cR;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(double gasLevel) {
        this.gasLevel = gasLevel;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public void setConsumptionRate(double consumptionRate) {
        this.consumptionRate = consumptionRate;
    }

    public void fill(double g) {
        if(gasLevel + g > capacity) {
            System.out.println("Cannot fill, exceeds capacity.");
        } else {
            gasLevel += g;
        }
    }

    public void drive(double d) {
        double requiredGas = consumptionRate*d;
        if(gasLevel < requiredGas) {
            System.out.println("Not enough gas, cannot travel.");
        } else {
            gasLevel -= requiredGas;
        }

        System.out.println("Gas remaining in tank: " + gasLevel);
    }
}
