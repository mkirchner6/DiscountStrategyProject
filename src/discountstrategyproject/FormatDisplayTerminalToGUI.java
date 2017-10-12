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
public class FormatDisplayTerminalToGUI implements FormatDisplayTerminal{

    @Override
    public void displayVideoTerminal(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
