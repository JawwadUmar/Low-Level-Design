package CreationalDesignPattern.FactoryDesignPattern;

public class WordDoc implements Document{
    @Override
    public void display() {
        System.out.println("Displaying the " + this.getClass().getSimpleName());
    }
}
