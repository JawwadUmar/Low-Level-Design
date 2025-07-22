package StructuralDesignPattern.DecoratorPattern;

public class MushroomDecorator extends Decorator{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description() + " Mushroom";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 2;
    }
}
