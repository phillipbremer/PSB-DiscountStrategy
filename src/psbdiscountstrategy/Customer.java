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
public class Customer {
    private String custID;
    private String custName;

    public Customer(String custID, String custName) {
        setCustID(custID);
        setCustName(custName);
    }
    
    public final String getCustID() {
        return custID;
    }

    public final void setCustID(String custID) {
        //needs validation
        this.custID = custID;
    }

    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName) {
        //needs validation
        this.custName = custName;
    }
}
