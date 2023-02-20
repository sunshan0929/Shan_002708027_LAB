/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import Author.Author;
import Genre.Genre;

/**
 *
 * @author shaoyifan
 */
public class Book {
    
    String name;
    String id;
    String abstraction;
    Genre genre;
    Author author;
    double price;

    public Book() {
    }

    public Book(String name, String id, String abstraction, double price) {
        this.name = name;
        this.id = id;
        this.abstraction = abstraction;
        this.price = price;
    }
    
    

    public String getAbstraction() {
        return abstraction;
    }

    public void setAbstraction(String abstraction) {
        this.abstraction = abstraction;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    

    
    
    
    
    
}
