package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsIncreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars (n): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Νέα γραμμή μετά από κάθε σειρά
        }

        sc.close();
    }
}
