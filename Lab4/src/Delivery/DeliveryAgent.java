/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delivery;

import Personnel.Person;
import java.util.ArrayList;
import Services.Order;
/**
 *
 * @author shansun
 */
public class DeliveryAgent extends Person{
    private int orderCount;
    
    private ArrayList<Order> agentOrderList;

    public DeliveryAgent() {
        super();
        this.agentOrderList = new ArrayList<>();
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public ArrayList<Order> getAgentOrderList() {
        return agentOrderList;
    }

    public void setAgentOrderList(ArrayList<Order> agentOrderList) {
        this.agentOrderList = agentOrderList;
    }
    
    public void addDeliveryOrder(Order o){
    this.agentOrderList.add(o);
    }
    
}
