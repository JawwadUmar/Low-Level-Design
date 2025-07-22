package StructuralDesignPattern.DecoratorPattern;

public class CheeseDecorator extends Decorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String description() {
        return decoratedPizza.description() + " Cheese";
    }

    @Override
    public double cost() {
        return decoratedPizza.cost() + 1;
    }
}
