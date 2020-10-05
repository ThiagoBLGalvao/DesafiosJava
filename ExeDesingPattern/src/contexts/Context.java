package contexts;

import interfaces.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int lp, int num){
        return strategy.doLifePointsChange(lp,num);
    }
}
