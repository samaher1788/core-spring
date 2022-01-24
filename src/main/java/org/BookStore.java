package org;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookStore {

    private List<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }

    public void addNewBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooksByTitle(String partialTitle) {
        var matchingBooks = new ArrayList<Book>();
        for (var book : books) {
            if (book.getTitle().toLowerCase().contains(partialTitle.toLowerCase())) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }

    public List<Book> findBooksByAuthor(String author) {
        // TODO
        return null;
    }

    public List<Book> findBooksByGenre(Genre genre) {
        // TODO
        return null;
    }
}
