/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psbdiscountstrategy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Phillip Bremer
 */
public class PrintReceipt {
    private Register register;
    private Receipt receipt;
    private LineItem[] lineItems;
    private Customer customer;
    
    public final void writeHeading(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Customer: " + customer.getCustName() + 
                "Customer ID: " + customer.getCustID() + "\n Date: " + 
                dateFormat.format(date) + "\n Thank you for shopping at Kohls \n"
                + "---------------------------------------------------------------------------"
                + " \n"
                + "Product ID     Product     Price     Qty     Discount     Subtotal");
    }
    
    public final void writeReceipt(){
        LineItem[] items = register.getReceipt().getLineItems();
        for(LineItem item : items){
            System.out.println(item.getProduct().getProdId() + "     " + 
                    item.getProduct().getProdName() + "     " + 
                    item.getProduct().getUnitCost() + "     " + 
                    item.getQty() + "     " + item.getLineItemDiscount() +
                    "     " + item.getSubtotal()
                );
        }
        System.out.println("Grand total: " ); //how do I get this?
    }
    
    public final void printTheReceipt(){
        writeHeading();
        writeReceipt();
    }
}
