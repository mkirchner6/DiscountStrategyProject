/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import javax.swing.JOptionPane;

/**
 *
 * @author mattkirchner
 */
public class Receipt {
    private LineItem[] lineItems = new LineItem[0];
    private Customer cust;

    public Receipt(String custID, ReceiptDataAccessStrategy da) {
        cust = da.findCustomer(custID);
    }
    
    public Receipt(ReceiptDataAccessStrategy da) {
        
    }

    public final void addItemToReceipt(String prodID, int qty, ReceiptDataAccessStrategy da) {
        LineItem lineItem = new LineItem(prodID, qty, da);
        addToArray(lineItem);
        displayToVideoTerminal();
    }

    private final void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public final void displayToVideoTerminal() {
        for(LineItem item: lineItems){
            JOptionPane.showMessageDialog(null, item);
        }
    }

    public final void displayReceipt(ReceiptFormatter rc) {
        for(LineItem item: lineItems){
            rc.displayReceipt(item);
        }
    }

}
