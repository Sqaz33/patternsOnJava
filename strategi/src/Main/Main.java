package Main;
import FlyBehavior.*;
import QuackBehavior.*;
import Duck.*;


public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        FlyBehavior flyBehavior = new FlyNoWay();
        mallardDuck.setFlyBehavior(flyBehavior);
        mallardDuck.performFly();
    }
}
