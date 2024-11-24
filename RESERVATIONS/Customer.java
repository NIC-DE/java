/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementmain;

/**
 *
 * @author nickd
 */
public class Customer {
    
    //ορίζω μια ιδιωτική μεταβλητή για τ όνομα
    
    private  String name;
    
    //ορίζω μια ιδιωτική μεταβλητή για τα 3 τελευταία ψηφία της πιστωτικής
    
    private  int creditCArd ;

    
    
    //2 δημιουργοί για το  όνομα και την πιστωτική κάρτα 
    public Customer() {
    }    
    
    
    public Customer(String name, int creditCArd) {
        this.name = name;
        this.creditCArd = creditCArd;
    }
    
    
    //μέθοδος string tostring

    @Override
    public String toString() {
        return "Customer{"  +  "name= "  +  name  +  " ,  creditCArd= "  +  creditCArd  +  '}';
    }
    
    // μέθοδος getter για να επιστραφεί το όνομα του πελάτη

    public String getName() {
        return name;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
