package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class WindowsOsFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new WindowsScroll();
    }
}
