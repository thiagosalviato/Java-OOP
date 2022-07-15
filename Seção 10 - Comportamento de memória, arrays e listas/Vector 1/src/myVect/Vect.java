package myVect;

import java.util.Locale;
import java.util.Scanner;

public class Vect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Creating a vector: */
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n ; i++) {
            vect[i] = sc.nextDouble();
        }

        /* Get the average: */
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("Avarage: %.2f%n" , avg);

        sc.close();
    }
}
