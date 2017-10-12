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
    public PercentOffDiscount(double discountPercent) {
    }
    
    @Override
    public final double getDiscount() {
        return 0;
    }
    
}
