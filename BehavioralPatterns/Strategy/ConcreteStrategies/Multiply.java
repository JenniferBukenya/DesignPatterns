package ConcreteStrategies;
public class Multiply implements Strategy {
    public int execute(int a, int b) {
        // TODO Auto-generated method stub
        System.out.print("Adding...");
        return (a*b);
    }
}
