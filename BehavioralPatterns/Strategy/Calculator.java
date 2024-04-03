import ConcreteStrategies.Add;
import ConcreteStrategies.Multiply;


public class Calculator {
    public static void main(String[] args) {
        Context context;
//strategy add
        context = new Context(new Add());
        int resultA = context.doStrategy(5, 6);
        System.out.println("Result A: "+resultA); 
//strategy multply
        context = new Context(new Multiply());
        int resultB = context.doStrategy(5, 6);
        System.out.println("Result B: "+resultB); 
    }
}
