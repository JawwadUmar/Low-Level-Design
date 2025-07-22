package CreationalDesignPattern.AbstractFactoryDesignPattern;

public class Application {
    private final Button button;
    private final Scrollbar scrollbar;

    public Application(UiFactory uiFactory){
        this.button = uiFactory.createButton();
        this.scrollbar = uiFactory.createScrollBar();
    }

    public void startApplication(){
        button.render();
        scrollbar.scroll();
    }
}
