/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psbdiscountstrategy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Phillip
 */
public class PrintReceiptGui implements OutputStrategy{
    public final void writeHeading(Receipt receipt){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("Customer ID: " + receipt.getCustomer().getCustID() + "\n"
                + "Customer: " + receipt.getCustomer().getCustName());
        System.out.println("Thank you for shopping at Kohls \n"
                + "---------------------------------------------------------------------------"
                + " \n"
                + "Product ID     Product     Price     Qty     Discount     Subtotal");
        
    }
    
    public final void writeReceipt(Receipt receipt){
        LineItem[] items = receipt.getLineItems();
        for(LineItem item : items){
            System.out.println(item.getProduct().getProdId() + "     " + 
                    item.getProduct().getProdName() + "     " + 
                    item.getProduct().getUnitCost() + "     " + 
                    item.getQty() + "     " + item.getLineItemDiscount() +
                    "     " + item.getSubtotal()
                );
            System.out.println("");
        }
        
        System.out.println("Grand total: $" + receipt.getGrandestTotal());
        System.out.println("Total saved today: $" + receipt.getSavings());
        System.out.println("Thank you for shopping at Kohl's");
    }
    
    public final void printReceipt(Receipt receipt){
        writeHeading(receipt);
        writeReceipt(receipt);
    }
    
    @Override
    public final void printTheReceipt(Receipt receipt){
        //Not quite sure what to do for a GUI output here
    }
}
