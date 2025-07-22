package CreationalDesignPattern.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        House house =  new House.HouseBuilder("Concrete", "Wooden", "Solid").setHasGarage(true).setHasSwimmingPool(true).build();

        System.out.println(house);
    }
}
