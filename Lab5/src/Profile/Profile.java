/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profile;

import Library.UserAccount;

/**
 *
 * @author shaoyifan
 */
public class Profile {
    String personID;
    String name;
    String age;
    UserAccount account;
    
    public Profile(){}

    public Profile(String personID, String name, String age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }
    
    

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }
    
    

    @Override
    public String toString() {
        return this.personID;
    }
    
}
