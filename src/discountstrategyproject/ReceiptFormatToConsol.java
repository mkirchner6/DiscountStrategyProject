/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;
import java.lang.Math;
import java.util.List;
/**
 *
 * @author mattkirchner
 */
public class ReceiptFormatToConsol implements ReceiptFormatter{

    @Override
    public final void displayReceipt(List<LineItem> items) {
        double total = 0;
        double discTotal = 0;
        
        for(LineItem item: items){
            total += item.getSubtotal() - item.getDiscountAmt();
            discTotal += item.getDiscountAmt();
            
            System.out.println(item.getProdName() + "   " + Math.floor(item.getUnitPrice() * 100) / 100 + "   " + item.getQty() + "   " + Math.floor(item.getSubtotal() * 100) / 100 + "   " + Math.floor(item.getDiscountAmt() * 100) / 100);
        }
        System.out.println("Total:  " + total);
        System.out.println("Total saved:  " + discTotal);
    }
    
    
}
