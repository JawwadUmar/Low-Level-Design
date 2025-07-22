package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class MacOsButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering the MacOsButton");
    }
}
