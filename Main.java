/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nickd
 */
public class Main {
    
    
    public static void main(String[] args) {
        //δημιουργία 2 αυτοκινήτων
        
        car c1=new car  ("Α1254",100,1);
        car c2=new car  ("Β1235",120,1);
        
        //Αύξηση ταχύτητας στο 1ο 2 φορές
        c1.speedup();
        c1.speedUp();
        
        
        //'αυξηση της ταχύτητας στο 2o 3 φορές
        
        c1.speedUp();
        c1.speedUp();
        c1.speedUp();
        
        //επιβίβαση ενός ακόμα επιβάτη στο 2ο αυτ/ο
        
        c2.addPassengers();
        
        //εκτύπωση της κατάστασης και των 2 αυτοκνήτων
        c1.printStatus();
        c2.printStaus();
        
        
    }
    
}
