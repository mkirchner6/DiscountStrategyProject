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
    private Product prod;
    private int qty;

    public LineItem(String prodID, int qty, ReceiptDataAccessStrategy da) {
        prod = da.findProduct(prodID);
        this.qty = qty;
    }
    
    public final double getSubtotal() {
        return prod.getUnitPrice() * qty;
    }
    
    public final double getDiscountAmt() {
        return prod.getDiscount().getDiscount(prod.getUnitPrice(), qty);
    }
    
    public final String getProdId() {
        return prod.getProdID();
    }
    
    
}
