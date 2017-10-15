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
public class ReceiptFormatToGUI implements ReceiptFormatter{

    @Override
    public final void displayReceipt(LineItem[] items) {
        double total = 0;
        double discTotal = 0;
        
        for(LineItem item: items){
            total += item.getSubtotal() - item.getDiscountAmt();
            discTotal += item.getDiscountAmt();
            
            JOptionPane.showMessageDialog(null, item.getProdName() + "   " + Math.floor(item.getUnitPrice() * 100) / 100 + "   " + Math.floor(item.getQty() * 100) / 100 + "   " + Math.floor(item.getSubtotal() * 100) / 100 + "   " + Math.floor(item.getDiscountAmt() * 100) / 100);
        }
        JOptionPane.showMessageDialog(null,"Total:  " + total);
        JOptionPane.showMessageDialog(null,"Total saved:  " + discTotal);
    }
}
