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
public class PercentOffDiscount implements Discount{
    private double discountPercent;
    
    public PercentOffDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    @Override
    public final double getDiscount(double unitCost, int qty) {
        return unitCost * qty * discountPercent;
    }
    
}
