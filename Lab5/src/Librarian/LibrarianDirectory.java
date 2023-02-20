/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librarian;


import Library.UserAccount;
import Library.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaoyifan
 */
public class LibrarianDirectory {
    List<Librarian> librarians;
    UserAccountDirectory accountdirectory;


    public LibrarianDirectory(UserAccountDirectory accountdirectory) {
        librarians = new ArrayList<>();
        this.accountdirectory = accountdirectory;
    }
    
    public UserAccountDirectory getAccountdirectory() {
        return accountdirectory;
    }

    public void setAccountdirectory(UserAccountDirectory accountdirectory) {
        this.accountdirectory = accountdirectory;
    }
    public List<Librarian> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(List<Librarian> librarians) {
        this.librarians = librarians;
    }
    
    public Librarian createLibrarian(String username, String password, String role, String personID, String name, String age){
        
        Librarian c = new Librarian (personID, name, age);
        UserAccount account  = this.accountdirectory.createUserAccount(username, password, role);
        c.setAccount(account);
        this.librarians.add(c);
        return c;
    
    }
    
    public Librarian findByPersonId(String id){
        for(Librarian c : this.librarians)
            if(c.getPersonID().equals(id))
                return c;
        return null;
    }
    
    public Librarian findByAccountId(String id){
        for(Librarian c : this.librarians)
            if(c.getAccount().getAccountId().equals(id))
                return c;
        return null;
    }
    
}
