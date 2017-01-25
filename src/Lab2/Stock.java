package Lab2;

import com.sun.deploy.util.StringUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Owner on 1/23/2017.
 */
public class Stock implements Comparable<Stock>{
    private String symbol;
    private double price;
    private int numberOfShares;

    public Stock(String symbol, double price, int numberOfShares) {
        this.symbol = symbol;
        this.price = price;
        this.numberOfShares = numberOfShares;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return 10;
    }
    /*Double.parseDouble(this.price.replace("$", "")) * this.numberOfShares*/

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public String toString() {
        return "Symbol: " + symbol + "\nPrice: " + price + "\nNumber of Shares: " + numberOfShares + "\nTotal Value: $" + getValue();
    }

    @Override
    public int compareTo(Stock s) {
        double thisStockValue = getValue();
        double thatStockValue = s.getValue();

        if(thisStockValue > thatStockValue) {
            return 1;
        } else if(thisStockValue < thatStockValue) {
            return -1;
        } else {
            return 0;
        }
    }
}
