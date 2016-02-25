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
    
    
}
