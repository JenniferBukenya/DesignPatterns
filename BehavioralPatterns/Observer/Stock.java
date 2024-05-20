package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject{
private List <StockObserver> observers=new ArrayList<>();
private double price;

public void setPrice(double price){
    this.price=price;
    notifyObservers();
}
    @Override
    public void register(StockObserver observer) {
        // TODO Auto-generated method stub
       observers.add(observer);
    }

    @Override
    public void unregister(StockObserver observer) {
        // TODO Auto-generated method stub
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
       for(StockObserver observer:observers){
        System.out.println(observer);
        observer.update(price);
       }
    }
    // public void getObservers(){
    //     System.out.println(observers);
    // }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
return price;
    }
    
}
