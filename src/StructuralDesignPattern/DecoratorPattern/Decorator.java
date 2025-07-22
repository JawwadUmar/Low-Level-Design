package StructuralDesignPattern.DecoratorPattern;

abstract public class Decorator implements Pizza{

    protected Pizza decoratedPizza;

    public Decorator(Pizza pizza){
        this.decoratedPizza = pizza;
    }
    @Override
    public String description() {
        return decoratedPizza.description();
    }

    @Override
    public double cost() {
        return decoratedPizza.cost();
    }
}
