package CreationalDesignPattern.FactoryDesignPattern;

public class HtmlDoc implements Document{
    @Override
    public void display() {
        System.out.println("Displaying the " + this.getClass().getSimpleName());
    }
}
