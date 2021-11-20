/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author jshar
 */
public class Menu {
    private String itemName;
    private double ItemPrice;
    private String restaurantName;
    
    public Menu(String itemName, double price, String restaurantName) {
        this.itemName = itemName;
        this.ItemPrice = price;
        this.restaurantName = restaurantName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
    
    @Override
    public String toString() {
        return itemName;
    }
    
    
    
}
