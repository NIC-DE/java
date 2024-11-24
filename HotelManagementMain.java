/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hotelmanagementmain;

/**
 *
 * @author nickd
 */
public class HotelManagementMain {

    public static void main(String[] args) {
        System.out.println("Απλή Εφαρμογή Διαχείρισης Ξενοδοχείου");
        System.out.println("=====================================");
        System.err.println();
        
        
        //δημιουργία ξενοδοχείου ονόματι Radisson Blue
        
        Hotel hotel =new Hotel("Radisson Blue","Chania");
        
        //δημιουργία 3 δωματίων
        
        Room room_1 =new Room(101,"δίκλινο");
        Room room_2 =new Room(102,"τρικλινο");
        Room room_3 =new Room(200,"σουίτα");
        
        //προσθήκη δωματίων στο ξενοδοχείο.To αντικείμενο hotel καλεί την μέθοδο addRoom
        
        hotel.addRoom(room_1);
        hotel.addRoom(room_2);
        hotel.addRoom(room_3);
        
        
        // δημιουργία πελατών με τα στοχεία τους
        
        Customer customer_1 =new Customer ("Διονύση Αδαμόπουλο",123);
        Customer customer_2 =new Customer ("Αμπατζόγλου Απόστολο",987);
       
        
        //Προσπάθεια κράτησης του Αδαμόπουλου στο 101

         hotel.makeReservation(customer_1, 101);

        
        //Προσπάθεια κράτησης του Αμπατζόγλου  στο 200
                
         hotel.makeReservation(customer_2, 200);                
                
                
        //Προσπάθεια κράτησης του Αμπατζόγλου στο 101
        
         hotel.makeReservation(customer_1, 101);

        
        System.out.println(hotel);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
