/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mathima2;

/**
 *
 * @author nickd
 */
public class Main {

    public static void main(String[] args) {
        //δημιουργία 2 αυτοκινήτων
        
        
        Car c1 =new Car("Α1254",100,1);
        Car c2 =new Car("1235",120,2);
        
        //άυξηση ταχήτητας στο 1ο 2 φορες
        c1.speedUp();
        c1.speedUp();
        
        // άυξηση ταχήτητας στο 2ο 3 φορες
        
        c2.speedUp();
        c2.speedUp();
        c2.speedUp();
        
        //εππιβίβαση ενός ακόμη επιβάτη στο 2ο αυτ/ο
        c2.addPassenger();
        
        
        //εκτύπωση  της κατάστασης και των 2 αυτοκινήτων
        
        c1.printStatus();
        c2.printStatus();
        
        
    }
}
