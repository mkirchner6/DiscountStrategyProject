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
    public static void main(String[] args) {
        //configuration
        POSTerminal pos = new POSTerminal();
        //data access
        ReceiptDataAccessStrategy da = new InMemoryDataAccess();
        //format for receipt
        ReceiptFormatter rc = new ReceiptFormatToConsol();
        //format for video display terminal
        FormatDisplayTerminal fdt = new FormatDisplayTerminalToGUI();
        
        //sale #1
        System.out.println("Customer #1");
        pos.startNewSale("200", da);
        pos.addItemToSale("A101", 3, da, fdt);
        pos.addItemToSale("C222", 5, da, fdt);
        pos.endSale(rc);
        System.out.println("");
        
        //sale #2
        System.out.println("Customer #2");
        pos.startNewSale("100", da);
        pos.addItemToSale("B205", 1, da, fdt);
        pos.addItemToSale("A101", 7, da, fdt);
        pos.endSale(rc);
        System.out.println("");
        
        //sale #3
        System.out.println("Customer #3");
        pos.startNewSale("200", da);
        pos.addItemToSale("B205", 2, da, fdt);
        pos.addItemToSale("C222", 1, da, fdt);
        pos.endSale(rc);
        System.out.println("");
    }
    
}
