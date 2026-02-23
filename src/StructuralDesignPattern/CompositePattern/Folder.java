package StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> fileSystemComponents;

    public Folder(String name){
        this.name = name;
        this.fileSystemComponents = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent fileSystemComponent){
        fileSystemComponents.add(fileSystemComponent);
    }

    @Override
    public void showDetails() {
        System.out.println("Folder: "+ this.name);
        for(FileSystemComponent fileSystemComponent: fileSystemComponents){
            fileSystemComponent.showDetails();
        }

    }
}
