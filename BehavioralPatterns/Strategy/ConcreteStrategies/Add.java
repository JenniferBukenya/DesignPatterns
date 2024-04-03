package ConcreteStrategies;
public class Add implements Strategy{

        @Override
        public int execute(int a, int b) {
            // TODO Auto-generated method stub
            System.out.print("Adding...");
            return (a+b);
        }
    
}
