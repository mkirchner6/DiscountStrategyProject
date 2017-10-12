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
public class LineItem {
    private LineItem[] lineItems = new LineItem[0];
    private ReceiptDataAccessStrategy da;
    private Product prod;
    private LineItem lineItem;

    public LineItem(String prodID, int qty, ReceiptDataAccessStrategy da) {
        this.setDa(da);
    }
    
    private final void addToArray(final LineItem item) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public final void addProductToLineItem(String prodID){
        prod = da.findProduct(prodID);
        
        this.addToArray(lineItem);
    }
    
    public final void setDa(ReceiptDataAccessStrategy da){
        if(da == null){
            throw new IllegalArgumentException("Must not be null");
        }
        this.da = da;
    }
    
    public final ReceiptDataAccessStrategy getDa(){
        return da;
    }
}
