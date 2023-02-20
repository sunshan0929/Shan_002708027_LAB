/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import Author.AuthorDirectory;
import Book.BookDirectory;
import Customer.CustomerDirectory;
import Genre.GenreDirectory;
import Librarian.LibrarianDirectory;

/**
 *
 * @author shansun
 */
public class Business {
    
    UserAccountDirectory accountDirectory;
    CustomerDirectory customerDirectory;
    LibrarianDirectory librarianDirectory;
    BookDirectory bookDirectory;
    GenreDirectory genreDirecotry;
    AuthorDirectory authorDirectory;

    public Business() {
        this.accountDirectory = new UserAccountDirectory();
        this.bookDirectory = new BookDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.genreDirecotry = new GenreDirectory();
        this.customerDirectory = new CustomerDirectory(this.accountDirectory);
        this.librarianDirectory = new LibrarianDirectory(this.accountDirectory);
        this.accountDirectory.createUserAccount("admin", "admin", "sysadmin");
    }

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public GenreDirectory getGenreDirecotry() {
        return genreDirecotry;
    }

    public void setGenreDirecotry(GenreDirectory genreDirecotry) {
        this.genreDirecotry = genreDirecotry;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public UserAccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(UserAccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public LibrarianDirectory getLibrarianDirectory() {
        return librarianDirectory;
    }

    public void setLibrarianDirectory(LibrarianDirectory librarianDirectory) {
        this.librarianDirectory = librarianDirectory;
    }
    
    
    
    
    
    
}
