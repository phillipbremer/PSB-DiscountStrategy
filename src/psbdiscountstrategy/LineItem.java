/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psbdiscountstrategy;

/**
 *
 * @author Phillip Bremer
 */
public class LineItem {
    private Product product;
    private int qty;
    private DatabaseStrategy db; //just in case if needed

    public LineItem(String prodId, int qty, DatabaseStrategy db) {
        this.qty = qty;
        setProduct(db.findProductById(prodId));
    }
    
    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        //needs verification
        this.product = product;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        //needs verification
        this.qty = qty;
    }
    
    public final double getSubtotal(){
        double subtotal = qty * product.getUnitCost();
        return subtotal;
    }
    
    public final double getLineItemDiscount(){      
        return product.getDiscount().getDiscountAmt(qty, product.getUnitCost());
    }
    
    public final double getLineItemTax(){
        double tax = 0.05;
        return product.getUnitCost() * tax * qty;
    }
    
    public final double getGrandSubtotal(){
        //contains all calcs per LineItem
        return getSubtotal() + getLineItemTax() - getLineItemDiscount();
    }
}
