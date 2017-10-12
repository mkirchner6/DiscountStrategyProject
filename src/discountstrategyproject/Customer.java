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
public class Customer {
    private String name;
    private String custID;

    public Customer(String custID, String name) {
        this.setCustID(custID);
        this.setName(name);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if(name == null){
            throw new IllegalArgumentException("This feild is required");
        }
        this.name = name;
    }

    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
        if(custID == null){
            throw new IllegalArgumentException("This feild is required");
        }
        this.custID = custID;
    }
    
    
}
