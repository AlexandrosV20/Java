package gr.aueb.cf.ch1.ch2;

import java.util.Scanner;

public class PrintDateApp {

    public static void main(String[] args) {

        int day, month, year1, year2;
        Scanner in = new Scanner(System.in);

        System.out.println("Δώστε την ημέρα, τον μήνα και την χρονιά :");
        day = in.nextInt();
        month = in.nextInt();
        year1 = in.nextInt();
        year2 = year1 % 100;

        System.out.printf("Η ημερομηνία έιναι %02d/%02d/%d.", day, month, year2);
    }
}
