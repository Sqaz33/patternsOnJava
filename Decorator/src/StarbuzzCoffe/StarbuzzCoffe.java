package StarbuzzCoffe;
import Beverage.*;
import CondimentDecorator.*;


public class StarbuzzCoffe {

    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        espresso.setSize(Beverage.Size.VENTI);
        espresso = new Mocha(espresso);
        espresso = new Whip(espresso);
        espresso = new Whip(espresso);

        System.out.println(espresso.getDescription()
                + " $" + espresso.cost());
    }
}
