package PizzaStore;
import Pizza.*;

public abstract class PizzaStore extends Pizza {

    // фабричный метод
    abstract Pizza createPizza(String type);

    // метод заказа пиццы
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
