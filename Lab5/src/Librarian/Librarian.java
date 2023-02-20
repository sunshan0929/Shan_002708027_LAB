/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librarian;

import Profile.Profile;
import RentalRequest.RentalRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shaoyifan
 */
public class Librarian extends Profile {
    
     List<RentalRequest> requests;

    public Librarian() {
        super();
        requests = new ArrayList<>();
    }

    public Librarian(String personID, String name, String age) {
        super(personID, name, age);
        requests = new ArrayList<>();
    }
    
    

    public List<RentalRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<RentalRequest> requests) {
        this.requests = requests;
    }
    
}