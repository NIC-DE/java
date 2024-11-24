/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propaideia;

/**
 *
 * @author Papatheodorou Konstantinos
 */
public class Propaideia {

    /**
     * Πρόγραμμα που τυπώνει την προπαίδεια του κάθε αριθμού, από το 1 μέχρι το
     * 10
     */
    public static void main(String[] args) {

        //Ορίζουμε τον μέγιστο αριθμό για την Προπαίδεια που θα κατασκευάσουμε    
        int tableSize = 10;

        // Καλούμε την printpropaideia με το όρισμα που δώσαμε(10)
        printpropaideia(tableSize);
    }

    public static void printpropaideia(int tableSize) {

        // Τυπώνουμε μερικά κενά
        System.out.format("      ");

        // Τυπώνουμε την 1η Γραμμή με τους Αριθμούς της Προπαίδειας 1-10
        for (int i = 1; i <= tableSize; i++) {
            System.out.format("%4d", i);
        }

        //Κατεβαίνουμε κάτω και τυπώνουμε μία γραμμή 
        System.out.println();
        System.out.println("----------------------------------------------");

        for (int i = 1; i <= tableSize; i++) {

            // Τυπώνουμε πρώτα τον αριθμό της κάθε σειράς 
            System.out.format("%d |", i);

            // Τυπώνουμε τον πολλαπλασιασμό του αριθμού σειράς i με τον αριθμό j (1-10)
            for (int j = 1; j <= tableSize; j++) {
                System.out.format("%4d", i * j);
            }

            System.out.println();

        }

    }

}
