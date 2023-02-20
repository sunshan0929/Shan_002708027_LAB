/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Library.Business;
import Library.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author shanSun
 */
public abstract class Role {
    
    static String[] roles = new String[]{"sysadmin", "librarian","customer"};
    
    public static String[] getRoles(){
            return roles;
        }
    public abstract JFrame getWorkArea(Business lib, UserAccount user);
    
}
