/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author shaoyifan
 */
public class UserAccountDirectory {
    ArrayList<UserAccount> userAccountList;
    
        public UserAccountDirectory(){
            this.userAccountList = new ArrayList<>();
        }
        
        public UserAccount createUserAccount(String username, String password, String role){
            UserAccount user = new UserAccount(username, password, role);
            
            this.userAccountList.add(user);
            
            return user;
        }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
        
        
        
        
        public UserAccount findById(String id){
        
            for(UserAccount u: this.userAccountList)
                if(u.getAccountId().equals(id))
                    return u;
                    
            return null;
        }
        
        
        public UserAccount getUserAccount(String username,  String password, String role){
        
        for(UserAccount u : this.userAccountList)
                    if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role))
                        return u;
                
        return null;
        }
        
        
        public boolean accountExists(String username,  String password, String role){
        
               for(UserAccount u : this.userAccountList)
                    if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role))
                        return true;
                
                return false;
        }
}
