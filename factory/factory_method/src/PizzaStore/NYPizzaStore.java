package PizzaStore;
import Pizza.*;

public class NYPizzaStore extends PizzaStore {

    // фабричный метод
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else
            return null;
    }
}
