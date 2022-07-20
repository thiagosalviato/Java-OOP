package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;

        System.out.println("How many people will be typed?");
        n =sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        double heightSum = 0.0;
        for (int i = 0; i < n; i++) {
            heightSum += height[i];
        }
        double heightAverage = heightSum / n;

        System.out.printf("Height Average: %.2f%n", heightAverage);

        int score = 0;
        for (int i = 0; i < n; i++) {
            if(age[i] < 16){
                score += 1;
            }
        }
        double percent = score * 100.00 / n;

        System.out.printf("People have less than sixteen years: %.1f%%%n", percent);

        sc.close();
    }
}
