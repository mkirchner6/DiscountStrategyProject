/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.util.List;

/**
 *
 * @author mattkirchner
 */
public interface ReceiptFormatter {
    public abstract void displayReceipt(List<LineItem> items);
}
