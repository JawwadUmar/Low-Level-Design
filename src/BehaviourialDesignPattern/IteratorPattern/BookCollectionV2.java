package IteratorPattern;

import java.util.*;

public class BookCollectionV2 implements Iterable<Book>{
    private Set<Book> books = new TreeSet<>();

    public void addBook(Book book){
        books.add(book);
    }
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
