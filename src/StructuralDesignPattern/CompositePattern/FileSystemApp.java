package StructuralDesignPattern.CompositePattern;

public class FileSystemApp {
    public static void main(String[] args) {
        Folder folder = new Folder("parent");
        FileSystemComponent file1 = new File("txt1");
        FileSystemComponent file2 = new File("txt2");
        FileSystemComponent file3 = new File("txt3");
        Folder subFolder1 = new Folder("sub1");
        Folder subFolder2 = new Folder("sub2");

        folder.addComponent(file1);
        folder.addComponent(file2);
        folder.addComponent(subFolder1);
        folder.addComponent(subFolder2);

        subFolder1.addComponent(file3);

        folder.showDetails();

    }
}
