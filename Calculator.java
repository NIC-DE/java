package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueCalculation = true;
            
            while (continueCalculation) {
                // Ζήτηση αριθμών από τον χρήστη
                System.out.print("Εισάγετε τον πρώτο αριθμό: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Εισάγετε τον δεύτερο αριθμό: ");
                double num2 = scanner.nextDouble();
                
                // Ζήτηση επιλογής πράξης
                System.out.print("Επιλέξτε πράξη (+, -, *, /): ");
                String operation = scanner.next();
                
                double result;
                
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        System.out.println("Το αποτέλεσμα είναι: " + result);
                        break;
                    case "-":
                        result = num1 - num2;
                        System.out.println("Το αποτέλεσμα είναι: " + result);
                        break;
                    case "*":
                        result = num1 * num2;
                        System.out.println("Το αποτέλεσμα είναι: " + result);
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Το αποτέλεσμα είναι: " + result);
                        } else {
                            System.out.println("Σφάλμα: Διαίρεση με το μηδέν δεν επιτρέπεται!");
                        }
                        break;
                    default:
                        System.out.println("Μη έγκυρη πράξη! Παρακαλώ επιλέξτε μία από τις (+, -, *, /).");
                        continue; // Επιστροφή στην αρχή του βρόχου
                }
                
                // Ερώτηση για συνέχιση
                while (true) {
                    System.out.print("Θέλετε να συνεχίσετε; (Y/N): ");
                    String userResponse = scanner.next();
                    
                    if (userResponse.equals("Y")) {
                        break; // Έξοδος από τον εσωτερικό βρόχο και συνέχιση του εξωτερικού
                    } else if (userResponse.equals("N")) {
                        continueCalculation = false;
                        break;
                    } else {
                        System.out.println("Λάθος εισαγωγή! Παρακαλώ απαντήστε με Y ή N.");
                    }
                }
            }
            
            System.out.println("Ευχαριστούμε που χρησιμοποιήσατε τον υπολογιστή!");
        }
    }
}
