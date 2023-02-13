/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Delivery.DeliveryAgent;
import java.util.ArrayList;

/**
 *
 * @author shansun
 */
public class MasterOrderDirectory {
    ArrayList<Order> orderList;

    public MasterOrderDirectory() {
        this.orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order createOrder(Customer customer, DeliveryAgent agent){
        Order o = new Order(customer, agent);
        this.orderList.add(o);
        return o;
    
    }
    
    public Order requestOrder(Customer customer){
    
    Order o = new Order();
    
    o.setCustomer(customer);
    
    this.orderList.add(o);
    
    return o;
    
    }
    
    public Order assignOrder(Order o, DeliveryAgent agent){
        o.setAgent(agent);
        return o;
    
    }
    
}
