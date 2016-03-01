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
public class Register {
    private Receipt receipt;
    private String storeName;
    private LineItem[] lineItem;
    private double grandTotal;
    private PrintReceipt print;
    
    public void startNewSale(String custId, DatabaseStrategy db){
        receipt = new Receipt(custId, db);
    }
    
    public final void addItemToSale(String prodId, int qty){
        receipt.addItemToReceipt(prodId, qty);
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }
    
    public final void setStoreName(String storeName) {
        //needs validation
        this.storeName = storeName;
    }
    
//    public final double getGrandTotal(){
//        //DO THE LOOP!... of some kind?
//        LineItem[] items = getReceipt().getLineItems();
//        for(LineItem item : items){
////            double total;
////            double addTo;
//            grandTotal = item.getGrandSubtotal();
//        }
//        return grandTotal;
//    }
    
    public final void endSale(){
        print = new PrintReceipt();
        print.printTheReceipt(receipt);
//        print.writeHeading();
//        print.writeReceipt();
    }
}
