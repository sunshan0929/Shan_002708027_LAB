/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;
import Services.Order;
import Personnel.Person;

/**
 *
 * @author shansun
 */
public class Customer extends Person{
    private int ordersTotal;
    
    private ArrayList<Order> customerOrderList;

    public Customer() {
        super();
        this.customerOrderList = new ArrayList<>();
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public ArrayList<Order> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(ArrayList<Order> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
    
    public void addOrder(Order o){
    this.customerOrderList.add(o);
    }
    
    
    
}
