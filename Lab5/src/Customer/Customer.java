/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Profile.Profile;
import RentalRequest.RentalRequest;
import java.util.*;

/**
 *
 * @author shaoyifan
 */
public class Customer extends Profile {
    
    List<RentalRequest> requests;

    public Customer() {
        super();
        requests = new ArrayList<>();
    }

    public Customer(String personID, String name, String age) {
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
