package org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/*
 * Instances of this class are responsible for interfacing to the user.
 * A BookUI object has a role in the system.
 * Spring will be used to manage objects of this class.
 */

/*
 * This annotations marks the class to be instantiated and managed by Spring.
 * This is an alternative to XML or Java config.
 * Component is another word for bean.
 */
@Component
public class BookUI {

    /*
     * BookUI HAS-A Scanner and a BookStore.
     * That is, BookUI is dependent on Scanner and BookStore.
     */
    @Autowired private Scanner scanner;
    @Autowired private BookStore bookStore;

    /*
     * Spring will try to create a BookUI object.
     * To do so it will search the container for a Scanner and a BookStore.
     * If it finds one of each it will use them to construct the BookUI.
     * If it can't find either one it will fail with an error.
     * The @Autowired annotation is not needed given there is only one constructor.
     */
//    public BookUI(Scanner scanner, BookStore bookStore) {
//        this.scanner = scanner;
//        this.bookStore = bookStore;
//    }

    public void addNewBook() {
        System.out.printf("Title: ");
        var title = scanner.nextLine();
        System.out.printf("Author: ");
        var author = scanner.nextLine();
        System.out.printf("Genre (fiction, non_fiction, reference, childrens): ");
        var genre = Genre.valueOf(scanner.nextLine().toUpperCase());
        var book = new Book(title, author, genre);
        bookStore.addNewBook(book);
    }

    public void findBooksByTitle() {
        System.out.printf("partial title: ");
        var partialTitle = scanner.nextLine();
         var matchingBooks = bookStore.findBooksByTitle(partialTitle);
         for (var book:matchingBooks){
             System.out.printf("%s by %s",book.getTitle());

         }
    }

    public void findBooksByAuthor() {
        // TODO
    }

    public void findBooksByGenre() {
        // TODO
    }
}
