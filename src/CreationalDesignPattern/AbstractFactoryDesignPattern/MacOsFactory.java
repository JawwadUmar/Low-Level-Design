package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class MacOsFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Scrollbar createScrollBar() {
        return new MacOsScroll();
    }
}
