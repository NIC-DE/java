/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationnumber;


 
 //@author Papatheodorou Konstantinos
 

//Εισάγουμε την κλάση Scanner ώστε να μπορούμε να εισάγουμε αριθμούς ή Strings
import java.util.Scanner;


public class MultiplicationNumber {
    /**
     * Πρόγραμμα που τυπώνει την προπαίδεια ενός αριθμού από το 1 μέχρι και το 10
     */
    
    
    public static void main(String[] args) {
        
        // Καλούμε την μέθοδο printMultiplicationTable με Μηδενικό Όρισμα
        printMultiplicationTable();

    }
    
    private static void printMultiplicationTable() {
        
        // Ορίζουμε τον αριθμό που θα εισάγουμε ως Integer(Ακέραιο)
        int number;
        
        //Αμυντικός προγραμματισμός ώστε ο ακέραιος που θα δίνεται να είναι από το 1 έως και το 10
        do{
        Scanner s = new Scanner(System.in);
        System.out.println("Παρακαλώ δώστε έναν αριθμό από το 1 έως και το 10 :");
        number = s.nextInt();
        }while (number >10 || number<1);
        
        
        System.out.println();
        System.out.println("Πίνακας Προπαίδειας για τον αριθμό "+number);
        System.out.println("---------------------------");

           // Υπολογίζουμε τον προπαίδεια του δοθέντος αριθμού
           for(int i = 1; i<=10;i++) {
            System.out.format("%d x %d = %-2d\n",number,i,i*number);
           }

    }

    
    
    
}
