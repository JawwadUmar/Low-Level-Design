package StructuralDesignPattern.ProxyPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ProxyImage img1 = new ProxyImage("bob.png");

        //Once the image is loaded, it does not need loading again (cached)
        //The loading happens only when the display method is called (lazy loading)
        img1.display();
        img1.display();

    }
}
