/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Restaurant.Restaurant;
import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.WorkQueue.WorkRequest;
import Business.Menu.Menu;

/**
 *
 * @author jshar
 */
public class Order extends WorkRequest {
    
    private String orderId;
    private String orderStatus;
    private Restaurant restaurant;
    private Customer customer;
    private String deliveryMan;
    private int quantity;
    private Menu menu;
    private String result;
    private boolean assign;
    
    public static final String orderPlaced = "Order Placed";
    public static final String orderAccepted = "Order Accepted";
    public static final String orderReady = "Order Ready, Assign Driver";
    public static final String orderOnDelivery = "Order out on Delivery";
    public static final String orderRejected = "Order Rejected";
    public static final String orderDelivered = "Order Delivered";

    public boolean isAssign() {
        return assign;
    }

    public void setAssign(boolean assign) {
        this.assign = assign;
    }
    
    

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(String deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
    
    @Override
    public String toString() {
        return orderId;
    }
    
}
