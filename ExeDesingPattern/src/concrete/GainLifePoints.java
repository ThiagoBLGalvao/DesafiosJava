package concrete;

import interfaces.Strategy;

public class GainLifePoints implements Strategy {
    @Override
    public int doLifePointsChange(int lp, int num) {
        return lp + num;
    }
}
