package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Δώστε ένα έτος");
        year = input.nextInt();

        if (((year%4 == 0) && (year%100 !=0)) || (year%400 == 0)){
            System.out.printf("Το έτος %d που δώσατε είναι δίσεκτο", year);
        } else {
            System.out.println("Το έτος που δώσατε δεν είνα δίσεκτο");
        }

    }
}
