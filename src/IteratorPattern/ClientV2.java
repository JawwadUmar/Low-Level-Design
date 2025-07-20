package IteratorPattern;

import java.util.Iterator;

public class ClientV2 {

    public static void main(String[] args) {
        BookCollectionV2 bookCollectionV2 = new BookCollectionV2();
        bookCollectionV2.addBook(new Book("Harry Potter"));
        bookCollectionV2.addBook(new Book("The Prince by Machiavelli"));
        bookCollectionV2.addBook(new Book("Fault in Our Start"));

        Iterator<Book> bookIterator = bookCollectionV2.iterator();

        while (bookIterator.hasNext()){
            System.out.println(bookIterator.next().getTitle());
        }
    }
}
