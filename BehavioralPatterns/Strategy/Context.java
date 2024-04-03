import ConcreteStrategies.Strategy;

public class Context{
    private Strategy strategy;

///getter
    public Context(Strategy s){
        this.strategy=s;
    }

    //execute strategy
    public int doStrategy(int a, int b){
        return this. strategy.execute(a,b);
    }

}
