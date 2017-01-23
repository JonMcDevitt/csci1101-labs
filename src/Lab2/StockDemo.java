package Lab2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Owner on 1/23/2017.
 */
public class StockDemo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Please enter a command. Type help for a list of commands. Type exit to exit the program\n");

        LinkedList<Stock> stocks = new LinkedList<>();
        String cmd = in.nextLine();
        while(!cmd.toLowerCase().equals("exit")) {
            switch(cmd.toLowerCase()) {
                case "help":
                    help();
                    cmd = in.nextLine();
                    break;
                case "create":
                    stocks.add(create(in));
                    cmd = in.nextLine();
                    break;
                case "mod":
                    mod(in, stocks);
                    cmd = in.nextLine();
                    break;
                case "rem":
                    remove(in, stocks);
                    cmd = in.nextLine();
                    break;
                case "list":
                    list(stocks, false);
                    cmd = in.nextLine();
                    break;
                default:
                    invalidCommand();
                    cmd = in.nextLine();
                    break;
            }
        }
    }

    private static void remove(Scanner in, LinkedList<Stock> stocks) {
        System.out.println("Please enter the number of the stock you would like to remove from the following list:");
        list(stocks, true);
        int ind = in.nextInt();
        System.out.print("Removing...");
        stocks.remove(ind);
        System.out.println("Done.");
    }

    private static void mod(Scanner in, LinkedList<Stock> stocks) {
        if(stocks.isEmpty()) {
            System.out.println("There are no stocks to modify.");
        } else {
            System.out.println("Select a stock from the list below by typing in the corresponding number:");
            list(stocks, true);
            Stock s = stocks.get(in.nextInt());
            System.out.println("Would you like to add (add) or remove (rem) from the number of shares? You may cancel by typing 'cancel'.");
            String cmd = in.nextLine();
            while(!cmd.toLowerCase().equals("cancel")) {
                switch(cmd.toLowerCase()) {
                    case "add":
                        System.out.println("How many stocks would you like to add?");
                        int n = in.nextInt();
                        System.out.print("Adding stocks...");
                        s.setNumberOfShares(s.getNumberOfShares() + n);
                        System.out.println("Done.");
                        cmd = in.nextLine();
                        break;
                    case "rem":
                        System.out.println("How many shares would you like to remove?");
                        int r = in.nextInt();
                        if (r < 1 || r >= s.getNumberOfShares()) {
                            System.out.println("Invalid amount. Cannot remove " + r + " shares.");
                        } else {
                            System.out.print("Removing shares...");
                            s.setNumberOfShares(s.getNumberOfShares() - r);
                            System.out.println("Done.");
                        }
                        cmd = in.nextLine();
                        break;
                    default:
                        System.out.println("Invalid command. Please enter either add, rem, or cancel.");
                        cmd = in.nextLine();
                        break;
                }
            }
        }
    }

    private static void list(LinkedList<Stock> list, boolean withNum) {
        if(withNum) {
            int i = 1;
            for(Stock s : list) {
                System.out.println(i + " - " + s);
            }
        } else {
            for(Stock s : list) {
                System.out.println(s);
            }
        }
    }

    private static Stock create(Scanner in) {
        System.out.println("Please enter the symbol of your stock.");
        String sym = in.nextLine();
        NumberFormat n = DecimalFormat.getCurrencyInstance();
        System.out.println("Please enter the value of your stock, in CAD. Please use only numbers.");
        double val = Double.parseDouble(n.format(Double.parseDouble(in.nextLine())));
        System.out.println("How many shares would you like in this stock?");
        int shares = in.nextInt();
        System.out.print("Creating stock...");
        Stock s = new Stock(sym, val, shares);
        System.out.println("Done");
        return s;
    }

    public static void invalidCommand(){
        System.out.println("Invalid command. Please enter a new command. Type help if you do not know the commands.");
    }

    public static void help(){
        System.out.println("\nThe following are the available commands:" +
                "\n\thelp\t-\tDisplay a list of commands.\n" +
                "\tcreate\t-\tCreate a new stock\n" +
                "\tmod\t\t-\tModify an existing stock\n" +
                "\trem\t\t-\tRemove an existing stock");
    }
}
