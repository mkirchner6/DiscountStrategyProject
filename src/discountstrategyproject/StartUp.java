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
        ReceiptDataAccessStrategy da = new InMemoryDataAccess();
        
        //sale #1
        pos.startNewSale("200", da);
        pos.addItemToSale("A101", "MLB Brewer's Hat", 3, da);
        pos.addItemToSale("C222", "Women's Socks", 5, da);
        pos.endSale();
    }
    
}
