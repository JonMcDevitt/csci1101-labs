package Lab2;

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

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public String toString() {
        return "Symbol: " + symbol + "\nPrice: " + price + "\nNumber of Shares: " + numberOfShares;
    }

    @Override
    public int compareTo(Stock s) {
        double thisStockValue = this.price * this.numberOfShares;
        double thatStockValue = s.getPrice() * s.getNumberOfShares();

        if(thisStockValue > thatStockValue) {
            return 1;
        } else if(thisStockValue < thatStockValue) {
            return -1;
        } else {
            return 0;
        }
    }
}
