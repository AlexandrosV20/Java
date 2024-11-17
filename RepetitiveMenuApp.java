package gr.aueb.cf.ch3;

import java.util.Scanner;

public class RepetitiveMenuApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Διαλέξατε την εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Διαλέξατε την διαγραφή");
            } else if (choice == 3) {
                System.out.println("Διαλέξατε την ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Διαλέξατε την αναζήτηση");
            } else if (choice == 5){
                System.out.println("Έξοδος από το μενού");
            } else {
                System.out.println("Δώστε ξανά αριθμό από 1 μέχρι 5 για να επιλέξεις λειτουργία από το μενού");
            }
        } while (choice != 5);
    }
}

