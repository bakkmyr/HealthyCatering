/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Rino
 */
public class OrderStatus {
    
    private Order order;
    private boolean toBeChanged;
    private boolean toBeDeleted; 
    
    public OrderStatus(){
        order = new Order();
        toBeChanged=false;
        toBeDeleted = false; 
    }
    public OrderStatus(Order order){
        this.order = order;
        toBeChanged = false;
        toBeDeleted = false; 
    }

    public Order getOrder() {
        return order;
    }
    public synchronized boolean getToBeChanged(){
        return toBeChanged;
    }
    public synchronized boolean getToBeDeleted(){
        return toBeDeleted;
    }
    public void setToBeChanged(){
        toBeChanged = !toBeChanged;
    }
    public void setToBeDeleted(boolean newToBeDeleted){
        toBeDeleted = newToBeDeleted; 
    }
    public void setOrder(Order newOrder){
        this.order = newOrder; 
    }
}

