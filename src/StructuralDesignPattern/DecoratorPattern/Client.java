package StructuralDesignPattern.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println(pizza.description());
        System.out.println(pizza.cost());
    }
}
