package gr.aueb.cf.ch1.ch2;

import java.util.Scanner;

public class CelsiusConversionApp {

    public static void main(String[] args) {

        double far,cel;
        Scanner in = new Scanner(System.in);

        System.out.println("Δώστε μια θερμοκρασία Fahrenheit");
        far = in.nextDouble();
        cel = 5 * (far - 32)/9;

        System.out.printf("Η θερμοκρασία %f βαθμούς Fahrenheit αντιστοιχεί σε %f βαθμούς Celsius", far, cel);


    }
}
