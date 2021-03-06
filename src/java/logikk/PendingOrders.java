/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logikk;

import DB.Database;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rino
 */
public class PendingOrders {

    private Database database = new Database();
    private ArrayList<Order> orders = new ArrayList();

    public PendingOrders() {
        
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    /*
     * returns the session before chefs have changed the values
     * 7=awaitingapproval 5 = FINISHED 4= on the road 6 = missing
     */
    public ArrayList<Order> getFirstOrdersChef() {
        return database.getPendingOrders("Select * from ORDERS where STATUS !=5 and STATUS!=4 and STATUS != 6 and STATUS !=7");
    }
    public ArrayList<Order> getFirstOrdersSalesmen(){
        return database.getPendingOrders("Select * from ORDERS where STATUS =7");
    }
    public ArrayList<Order> getFirstOrdersDrivers() {
        return database.getPendingOrders("Select * from ORDERS where STATUS=3 or STATUS=4 or STATUS=5");
    }

    public void updateDb(Order s) {
        database.updateOrder(s);
    }
}
