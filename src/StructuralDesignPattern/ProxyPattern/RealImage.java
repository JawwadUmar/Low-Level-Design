package StructuralDesignPattern.ProxyPattern;

public class RealImage implements Image {

    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageIntoDisk();
    }
    @Override
    public void display() {
        System.out.println("displaying the image ....");
    }

    public void loadImageIntoDisk(){
        System.out.println("loading image to disk ....");
    }
}
