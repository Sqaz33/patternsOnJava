package Beverage;


public abstract class Beverage {
    /*
     * Beverage - абстрактный класс с двумя
     * методами: getDescription() и cost()
     * */

    public enum Size {
        TALL,
        GRANDE,
        VENTI
    };
    Size size = Size.TALL;
    String description = "Unknown Beverage";

    // метод getDescription() уже
    // реализован, а метод cost()
    // необходимо реализовать в
    // субклассах
    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();

}
