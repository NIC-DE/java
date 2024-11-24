/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearequation;

/**
 *
 * @author Papatheodorou Konstantinos
 */
//Εισάγουμε την κλάση Scanner ώστε να μπορούμε να εισάγουμε αριθμούς ή Strings
import java.util.Scanner;

public class Linearequation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Ορίζουμε τις μεταβλητές ακεραίων(int) a και b
        int a, b;

        // Εισάγουμε τον όρο a
        Scanner s = new Scanner(System.in);
        // Θέτουμε το Scanner να σταματά την ανάγνωση ανά γραμμή και όχι ανά λέξη
        s.useDelimiter("\n");
        System.out.print("Δώσε το a: ");

        // Αμυντικός προγραμματισμός ώστε ο a να είναι ακέραιος
        while (s.hasNextInt() == false) {
            System.out.println("Το a πρέπει να είναι ακέραιος αριθμός!");
            s.next();//καλεί για να διαβάσει και να απορρίψει την λάθος τιμή
            System.out.print("Δώσε το a: ");
        }
        a = s.nextInt();

        // Εισάγουμε τον όρο β
        System.out.print("Δώσε το b: ");

        // Αμυντικός προγραμματισμός ώστε ο b να είναι ακέραιος
        while (s.hasNextInt() == false) {
            System.out.println("Το b πρέπει να είναι ακέραιος αριθμός!");
            s.next();//καλεί για να διαβάσει και να απορρίψει την λάθος τιμή
            System.out.print("Δώσε το b: ");
        }
        b = s.nextInt();

        // Έλεγχος εάν η εξίσωση είναι Αόριστη ή Αδύνατη
        if (a == 0) {
            if (b == 0) {
                System.out.println("Αόριστη");
            } else {
                System.out.println("Αδύνατη");
            }
        } //Υπολογισμός της εξίσωσης
        else {
            double x = -b / (double) a;
            System.out.println("Λύση x = " + x);//εδώ εξετάζει αν α#0 άσχετα από τιμές του b
        }

        // Καταστροφή του Scanner
        s.close();

    }

}
