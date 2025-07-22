package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class MacOsScroll implements Scrollbar{
    @Override
    public void scroll() {
        System.out.println("Scrolling the MacOs Scrollbar");
    }
}
