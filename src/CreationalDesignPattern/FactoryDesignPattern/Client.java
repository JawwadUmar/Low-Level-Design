package CreationalDesignPattern.FactoryDesignPattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String docs = sc.nextLine();

        try {
            Document x= DocumentFactory.createDocument(docs);
            x.display();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
