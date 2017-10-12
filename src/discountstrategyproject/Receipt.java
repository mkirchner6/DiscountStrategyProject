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

    public final void addItemToReceipt(String prodID, int qty, ReceiptDataAccessStrategy da, FormatDisplayTerminal fdt) {
        LineItem lineItem = new LineItem(prodID, qty, da);
        addToArray(lineItem);
        displayToVideoTerminal(fdt);
    }

    private final void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    private final void displayToVideoTerminal(FormatDisplayTerminal fdt) {
        String data = "";
        for(LineItem item: lineItems){
            data += item.getProdName() + "   " + item.getUnitPrice() + "   " + item.getQty() + "   " + item.getSubtotal() + "   " + item.getDiscountAmt() + "\n";
        }  
        JOptionPane.showMessageDialog(null, data);
    }

    public final void displayReceipt(ReceiptFormatter rc) {
        for(LineItem item: lineItems){
            rc.displayReceipt(item);
        }
    }

}
