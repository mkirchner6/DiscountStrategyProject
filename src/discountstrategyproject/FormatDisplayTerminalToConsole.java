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
public class FormatDisplayTerminalToConsole implements FormatDisplayTerminal{

    @Override
    public final void displayVideoTerminal(String msg) {
        System.out.println(msg);
    }
    
}
