package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class client {

    public static void main(String[] args) {
    // List <StockObserver> observers=new ArrayList<>();

        Stock newStock = new Stock();
        StockObserver me = new User("Jenny");
        StockObserver another = new User("Racheal");

        newStock.register(me);
        newStock.register(another);
        // newStock.getObservers();
        newStock.setPrice(34598);

        // System.out.println(observers);
        newStock.unregister(another);
        System.out.println("\n");
        newStock.setPrice(9990);

        // newStock.getObservers();
    }
}
