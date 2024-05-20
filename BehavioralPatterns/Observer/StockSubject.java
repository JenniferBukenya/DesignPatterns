package BehavioralPatterns.Observer;

public interface StockSubject {
    void register(StockObserver observer);
    void unregister (StockObserver observer);
    void notifyObservers();
    double getPrice();
}
