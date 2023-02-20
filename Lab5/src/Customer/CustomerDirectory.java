/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;
import Library.UserAccount;
import Library.UserAccountDirectory;
import java.util.*;
/**
 *
 * @author shaoyifan
 */
public class CustomerDirectory {
    
    List<Customer> customers;
    UserAccountDirectory accountdirectory;

    public CustomerDirectory(UserAccountDirectory accountdirectory) {
        customers = new ArrayList<>();
        this.accountdirectory = accountdirectory;
    }

    public UserAccountDirectory getAccountdirectory() {
        return accountdirectory;
    }

    public void setAccountdirectory(UserAccountDirectory accountdirectory) {
        this.accountdirectory = accountdirectory;
    }
    
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    
    public Customer createCustomer(String username, String password, String role, String personID, String name, String age){
        
        Customer c = new Customer (personID, name, age);
        UserAccount account = this.accountdirectory.createUserAccount(username, password, role);
        c.setAccount(account);
        this.customers.add(c);
        return c;
    }
    
    public Customer findByPeronId(String id){
        for(Customer c : this.customers)
            if(c.getPersonID().equals(id))
                return c;
        return null;
    }
    
    public Customer findByAccountId(String id){
        for(Customer c : this.customers)
            if(c.getAccount().getAccountId().equals(id))
                return c;
        return null;
    }
    
    
    
}
