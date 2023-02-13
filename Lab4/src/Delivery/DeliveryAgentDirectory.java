/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delivery;

import java.util.ArrayList;

/**
 *
 * @author shansun
 */
public class DeliveryAgentDirectory {
    
    ArrayList<DeliveryAgent> agentList;

    public DeliveryAgentDirectory() {
        this.agentList = new ArrayList<>();
    }

    public ArrayList<DeliveryAgent> getAgentList() {
        return agentList;
    }

    public void setAgentList(ArrayList<DeliveryAgent> agentList) {
        this.agentList = agentList;
    }
    
    
    public DeliveryAgent findById(String id){
        for(DeliveryAgent d : this.agentList)
            if(d.getPersonID().equals(id))
                return d;
        return null;
    }
    
    public DeliveryAgent createAgent(String id, String name, String age){
    
    DeliveryAgent d = new DeliveryAgent();
    
    d.setAge(age);
    d.setName(name);
    d.setPersonID(id);
    
    this.agentList.add(d);
    
    return d;
    
    }
    
    
}
