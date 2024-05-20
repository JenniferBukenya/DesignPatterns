package BehavioralPatterns.Observer;

public class User implements StockObserver {
    private String name;
    public User(String n){
    this.name=n;
}
    @Override
    public void update(double price) {
        // TODO Auto-generated method stub
        System.out.println("Notification for "+ name + ": Stock price changed to "+ price );
    }
    
}
