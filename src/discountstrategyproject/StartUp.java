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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //configuration
        POSTerminal pos = new POSTerminal();
        //data access
        ReceiptDataAccessStrategy da = new InMemoryDataAccess();
        //format receipt
        ReceiptFormatter rc = new ReceiptFormatToConsol();
        
        //sale #1
        pos.startNewSale("200", da);
        pos.addItemToSale("A101", 3, da);
        pos.addItemToSale("C222", 5, da);
        pos.endSale(rc);
        
        //sale #2
        pos.startNewSale("100", da);
        pos.addItemToSale("B205", 1, da);
        pos.addItemToSale("A101", 7, da);
        pos.endSale(rc);
        
        //sale #3
        pos.startNewSale("200", da);
        pos.addItemToSale("B205", 2, da);
        pos.addItemToSale("C222", 1, da);
        pos.endSale(rc);
    }
    
}
