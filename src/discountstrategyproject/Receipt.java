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
    private LineItem lineItem;
    private Customer cust;

    public Receipt(String custID, ReceiptDataAccessStrategy da) {
        cust = da.findCustomer(custID);
    }
    
    public final void addItemToReceipt(String prodID, int qty, ReceiptDataAccessStrategy da){
        lineItem = new LineItem(prodID, qty, da);
    }
    
    public final void displayReceipt(){
        
    }
    
}
