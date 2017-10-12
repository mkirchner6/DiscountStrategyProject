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
public class POSTerminal {
    private Receipt receipt;
    
    public final void startNewSale(String custID, ReceiptDataAccessStrategy da){
        Receipt receipt = new Receipt(custID, da);
    }
    
    public final void addItemToSale(String prodID, String name, int qty, ReceiptDataAccessStrategy da){
        receipt.addItemToReceipt(prodID, qty, da);
    }
    
    public final void endSale(){
        receipt.displayReceipt();
    }
}
