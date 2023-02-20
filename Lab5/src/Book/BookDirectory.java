/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import Author.Author;
import Author.AuthorDirectory;
import Genre.Genre;
import Genre.GenreDirectory;
import java.util.*;

/**
 *
 * @author shaoyifan
 */
public class BookDirectory {
    
    List<Book> books;


    public BookDirectory( ) {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public Book createBook(String name, String id, String abstraction, double price){
        
    Book b = new Book(name, id, abstraction, price);
    
    this.books.add(b);
    
    return b;
    
    }
    
    public Book findByID(String id){
        for(Book b : this.books)
            if(b.getId().equals(id))
                return b;

        return null;
    }
    
    
    
    
}
