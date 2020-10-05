import concrete.GainLifePoints;
import concrete.SubstractLifePoints;
import contexts.Context;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new GainLifePoints());
        System.out.println(context.executeStrategy(4000, 1000));

        context = new Context(new SubstractLifePoints());
        System.out.println(context.executeStrategy(4000, 2550));
        System.out.println(context.executeStrategy(4000, 5000));
    }
}
