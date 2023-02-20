/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Author;

import Profile.Profile;

/**
 *
 * @author shaoyifan
 */
public class Author extends Profile{

    public Author() {
        super();
    }

    public Author(String personID, String name, String age) {
        super(personID, name, age);
    }

    @Override
    public String toString() {
        return this.getName();
    }
    
    
    
    
}
