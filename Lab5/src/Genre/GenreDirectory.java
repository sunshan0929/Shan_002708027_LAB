/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Genre;

import java.util.*;

/**
 *
 * @author shaoyifan
 */
public class GenreDirectory {
    
    List<Genre> genres;

    public GenreDirectory() {
        genres = new ArrayList<>();
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
    
    public Genre createGenre(String name, String id){
        Genre g = new Genre(name, id);
        
        this.genres.add(g);
        
        return g;
    }
    
    public Genre findByID(String id){
        for(Genre g : this.genres)
            if(g.getId().equals(id))
                return g;
        return null;
    }
    
    
    
    
    
}
