package concrete;

import interfaces.Strategy;

public class SubstractLifePoints implements Strategy {
    @Override
    public int doLifePointsChange(int lp, int num) {
        if(lp - num <= 0)  return 0;
        else return lp - num;
    }
}
