/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Author;

import java.util.*;

/**
 *
 * @author shaoyifan
 */
public class AuthorDirectory {
    
    List<Author> authors;

    public AuthorDirectory() {
        authors = new ArrayList<>();
    }
    
    

    public AuthorDirectory(List<Author> authors) {
        this.authors = authors;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    
    public Author createAuthor(String personID, String name, String age){
        Author author = new Author(personID, name, age);
        
        this.authors.add(author);
        
        return author;
    }
    
    public Author findById(String id){
        for(Author a : this.authors)
            if(a.getPersonID().equals(id))
                return a;
        return null;
    }
    
    
}
