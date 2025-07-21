package IteratorPattern;

import java.util.Iterator;

public class CleintV1 {

    public static void main(String[] args) {
        BookCollectionV1 bookCollectionV1 = new BookCollectionV1();
        bookCollectionV1.addBook(new Book("Harry Potter"));
        bookCollectionV1.addBook(new Book("The Prince by Machiavelli"));
        bookCollectionV1.addBook(new Book("Fault in Our Start"));

        Iterator<Book> bookIterator = bookCollectionV1.createIterator();

        while (bookIterator.hasNext()){
            System.out.println(bookIterator.next().getTitle());
        }
    }
}
