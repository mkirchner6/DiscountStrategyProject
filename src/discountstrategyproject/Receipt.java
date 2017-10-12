/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author mattkirchner
 */
public class Receipt {
    private Product prod;
    private LineItem lineItem;

    public Receipt(String custID) {
        
    }
    
    public final Receipt getReceipt(String prodID, int qty, ReceiptDataAccessStrategy da){
        lineItem = new LineItem(prodID, qty, da);
        return null;
    }
    
    public final void displayReceipt(){
        
    }
    
}
