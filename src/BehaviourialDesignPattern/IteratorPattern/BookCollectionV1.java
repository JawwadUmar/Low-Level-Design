package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollectionV1 {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    //this method is already defined in the iterable interface (implements iterable)
    public Iterator<Book> createIterator(){
        return new BookIterator(books);
    }

    private class BookIterator implements Iterator<Book>{
        private List<Book> books;
        private int position = 0;

        public BookIterator(List<Book> books){
            this.books = books;
        }
        @Override
        public boolean hasNext() {
            return position<books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }


}
