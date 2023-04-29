package CondimentDecorator;
import Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage{

    // используется подтип Beverage
    // чтобы декоратор мог стать
    // оберткой для любого напитка
    Beverage beverage;

    public abstract String getDescription();

}
