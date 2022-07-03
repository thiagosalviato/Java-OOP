package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Enter employee data");
        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("GrossSalary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax Percentage:");
        employee.taxPercentage = sc.nextDouble();

        employee.NetSalary();

        System.out.println("Which percentage to increase salary? ");
        double taxPercentage = sc.nextDouble();
        employee.increaseSalary(taxPercentage);

        System.out.println("Updated data: " +  employee);

        sc.close();
    }
}
