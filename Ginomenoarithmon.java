package com.example.ginomenoarithmon.ginomenoarithmon;

import java.util.Scanner;

/**
 * @author Papatheodorou Konstantinos
 */
public class Ginomenoarithmon {
    public static void main(String[] args) {
        System.out.println("*** Πρόγραμμα που διαβάζει 10 αριθμούς και τυπώνει το γινόμενο τους ****");

        int i = 1;
        int number;
        int product = 1;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Παρακαλώ δώστε τον " + i + "ο Αριθμό: ");
            
            if (input.hasNextInt()) {
                number = input.nextInt();
                product *= number;
                i++;
            } else {
                input.next();
                System.out.println("*** Παρακαλώ δώστε μου έναν ακέραιο ***");
            }
        } while (i <= 10);

        System.out.println("Το γινόμενο των 10 αριθμών είναι: " + product);
        input.close();
    }
}
