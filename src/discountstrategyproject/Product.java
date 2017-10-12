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
public class Product {
    private String name;
    private String prodID;
    private double unitPrice;
    private Discount discount;
    
    public Product(String prodID, String name, double unitPrice, Discount discount) {
        this.setProdID(prodID);
        this.setName(name);
        this.setUnitPrice(unitPrice);
        this.setDiscount(discount);
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

    public final String getProdID() {
        return prodID;
    }

    public final void setProdID(String prodID) {
        if(prodID == null){
            throw new IllegalArgumentException("This feild is required");
        }
        this.prodID = prodID;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        if(unitPrice == 0){
            throw new IllegalArgumentException("This feild is required");
        }
        this.unitPrice = unitPrice;
    }

    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if(discount == null){
            throw new IllegalArgumentException("This feild is required");
        }
        this.discount = discount;
    }
    
}
