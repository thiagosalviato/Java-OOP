package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.println("Student Name: ");
        student.name = sc.nextLine();
        System.out.println("First Grade: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Second Grade: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Third Grade: ");
        student.grade3 = sc.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.println("FINAL GRADE = " + finalGrade);
        String finalResult = student.finalResult();
        System.out.println(finalResult);
        double pointsToPass = student.pointsToPass();
        if (pointsToPass != 0){
            System.out.println("MISSING " + pointsToPass + " POINTS");
        }

        sc.close();
    }
}
