/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementmain;

/**
 *
 * @author nickd
 */
class Room {

    //ορίζω μεταβλητή με το μοναδικό όνομα δωματίου
    private int ID;
    
    //ορίζω τον τύπο του δωματίου(πχ δίκλινο,τρίκλνο,σουίτα)
    private String  type;
    
    //ορίζω αντικείμενο με τον πελάτη όπου βρίσκεται στο δωμάτιο
    private Customer  customer;
    
    //ορίζω μεταβλητή boolean
    private  boolean isfree;
    
    //ορίζω 2 δημιουργούς με ή χωρίς ορίσματα για το ID

    public Room(int ID, String type) {
        this.ID = ID;
        this.type = type;       
        this.isfree = true;
    }

    public Room(boolean isfree) {
        this.isfree= true;
    }
    
    
    // μέθοδος η οποία δίνει τιμή στα πεδία customer ,isfree
    
    public void setCustomer (Customer customer){
            
       
       if(isfree)   {
    
         this.customer=customer; 
         this.isfree = false;
         System.out.println(" Έγινε κράτηση του δωματίου με κωδικό  "  +  this.ID  + " για τον πελάτη " +  this.customer.getName());       
       
    }else  {
            
            
          System.out.println(" Για το δωμάτιο με κωδικό    "  +   this.ID   +   " έχει γίνει ήδη κράτηση από τον πελάτη  "  +  this.customer.getName());

            }
        
             
    }
    
    
    // 1 μέθοδος isfree η οποία επιστρέφει true αν ικανοποιηθει συνθήκη του if αλλίως false
    public boolean  isfree (){
        if (isfree){
            
            this.isfree=false;
            return  true;
            
            
        }    else {
            
            return  false;
        }       
        
    }  
    
    //1 μέθοδος string toString για αναγνωσιμότητα

    @Override
    public String toString() {
        return "Room{" + "ID=" + ID + ", type=" + type + ", customer=" + customer + ", isfree=" + isfree + '}';
    }
    
    //Επιλογή Getter για να επιστραφεί το ID του δωματίου
    public int getID() {
        return ID;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
