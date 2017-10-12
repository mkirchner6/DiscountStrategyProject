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
public class ReceiptFormatToConsol implements ReceiptFormatter{

    @Override
    public final void displayReceipt(LineItem item) {
        System.out.println(item.getProdName() + "   " + item.getUnitPrice() + "   " + item.getQty() + "   " + item.getSubtotal() + "   " + item.getDiscountAmt());
    }
    
}
