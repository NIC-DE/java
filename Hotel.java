/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementmain;
import java.util.Arrays;

/**
 *
 * @author nickd
 */
public class Hotel {
    //μεταβλητή με το μοναδικό όνομα του ξενοδοχείου
    private String name;
    
    //μεταβλητή για την τοποθεσία  του ξενοδοχείου
    private String location;
    
    //πίνακας όπου περιέχει τον αριθμό των δωματίων max=10 rooms
    private  Room[] roomlist =new Room[10];   
   
    
     // αρχικοποίηση για τον αριθμό των δωματίων
    private int Numberofrooms=0;    
    
    
    //δημιουργός χωρίς ορίσματα για το ξενοδοχείο
    public Hotel() {
    }
    
    //δημιουργός με ορίσματα το όνομα και την τοπθεσία του ξενοδοχείου
    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    //μέθοδος για την προσθήκη των δωματίων
public void  addRoom(Room r){
    
    roomlist[Numberofrooms]=r;
    Numberofrooms+=1;    
    }

//έλεγχος αν υπάρχει διαθέσιμο δωμάτιο.Αν το δωμάτιο είναι κλεισμένο εμφανίζεται μήνυμα λάθους
// Check if a room is available. If the room is booked, display an error message.
public void makeReservation(Customer customer, int roomID) {
    boolean roomFound = false;
    
    for (Room room : roomlist) {
        if (room != null && room.getID() == roomID) {
            room.setCustomer(customer);
            roomFound = true;
            break;
        }
    }
    
    if (!roomFound) {
        System.out.println("No availability for room " + roomID);
    }
}


    //μέθοδος sting tostring() η οποία επιστρέφει σε μορφή κειμένου τα στοιχεία του ξενοδοχείου,των δωματίων, και των πελατών που διαμένουν σε αυτά 

    @Override
    public String toString() {
        return "Hotel{" + "name=" + name + ", location=" + location + ", roomlist=" + Arrays.toString(roomlist)+ '}';
    }

   

    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

