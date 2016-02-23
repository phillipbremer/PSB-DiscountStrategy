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
public class FakeDatabase {
    private Customer[] customers = {
        new Customer("100", "Billy James"),
        new Customer("200", "Sally Jean"),
        new Customer("300", "Leonidas of Sparta")
    };
    private Product[] products = {
        new Product("11", "Brewer's Hat", 29.95, new PercentOffDiscount(.10)),
        new Product("22", "Women's Blouse", 49.95, new FlatAmtDiscount(5.00)),
        new Product("33", "Men's Black Belt", 39.95, new NoDiscount())
    };
    
    public final Product findProductById(String prodId){
        //needs validation
        Product product = null;
        for(Product p : products){
            if(p.getProdId().equals(prodId)){
                product = p;
                break;
            }
        }
        return product;
    }
    
    public final Customer findCustomerById(String custId){
        //needs validation
        Customer customer = null;
        for(Customer c : customers){
            if(c.getCustID().equals(custId)){
                customer = c;
                break;
            }
        }
        return customer;
    }
}
