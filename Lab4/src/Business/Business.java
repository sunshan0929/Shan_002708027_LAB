/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustormerDirectory;
import Delivery.DeliveryAgentDirectory;
import Services.MasterOrderDirectory;

/**
 *
 * @author shansun
 */
public class Business {
    
    private UserAccountDirectory userAccountDirectory ;
    private CustormerDirectory custormerDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private MasterOrderDirectory masterOrderDirectory;
    
    public Business(){
        this.custormerDirectory = new CustormerDirectory();
        this.deliveryAgentDirectory = new DeliveryAgentDirectory();
        this.masterOrderDirectory = new MasterOrderDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
       
       this.userAccountDirectory.createUserAccount("admin", "admin", "manager");
      UserAccount cust= this.userAccountDirectory.createUserAccount("admin", "admin", "customer");
       this.custormerDirectory.createCustomer(cust.getAccountId(), cust.getUsername(), "11");
       this.userAccountDirectory.createUserAccount("admin", "admin", "agent");
    }
    
    public static Business getBusinessInstance(){
        return new Business();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CustormerDirectory getCustormerDirectory() {
        return custormerDirectory;
    }

    public void setCustormerDirectory(CustormerDirectory custormerDirectory) {
        this.custormerDirectory = custormerDirectory;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public MasterOrderDirectory getMasterOrderDirectory() {
        return masterOrderDirectory;
    }

    public void setMasterOrderDirectory(MasterOrderDirectory masterOrderDirectory) {
        this.masterOrderDirectory = masterOrderDirectory;
    }
    
    
    
}
