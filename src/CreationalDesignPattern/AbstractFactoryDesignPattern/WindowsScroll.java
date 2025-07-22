package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class WindowsScroll implements Scrollbar{
    @Override
    public void scroll() {
        System.out.println("Scrolling the Windows Scrollbar");
    }
}
