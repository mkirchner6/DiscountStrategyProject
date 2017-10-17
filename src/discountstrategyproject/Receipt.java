/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.util.Date;
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
            data += item.getProdName() + "   " + Math.floor(item.getUnitPrice() * 100) / 100 + "   " + item.getQty() + "   " + Math.floor(item.getSubtotal() * 100) / 100 + "   " + Math.floor(item.getDiscountAmt() * 100) / 100 + "\n";
        }
        fdt.displayVideoTerminal(data);
    }

    public final void displayReceipt(ReceiptFormatter rc) {
        receiptStoreInfo();
        rc.displayReceipt(lineItems);
    }
    
    private final void receiptStoreInfo() {
        System.out.println("Thank you for shopping at Kohl's");
        System.out.println(new Date());
        System.out.println("");
        System.out.println("Thank you " + cust.getName() + " for shopping at Kohl's");
        System.out.println("");
    }

}
