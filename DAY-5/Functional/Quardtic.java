package com.bridgelabz.assignment.quardatic;
import java.util.Scanner;

public class Quardatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();
        double delta = ((b * b) - (4 * a * c));
        if (delta > 0) {
            double root1 =(((-b) + Math.sqrt(delta))/ (2 * a));
            double root2 =(((-b) - Math.sqrt(delta))/ (2 * a));
            System.out.println("Root1 value is " + root1);
            System.out.println("Root2 value is " + root2);
        }
        else if(delta == 0) {
            double root1 = (-b) / (2 * a);
            double root2 = (-b) / (2 * a);
            System.out.println("Root1 value is " + root1);
            System.out.println("Root2 value is " + root2);
        }
        else if (delta < 0) {
            double imaginary_root = Math.sqrt(-delta) / (2 * a);
            double real_root = (-b) / (2 * a);
            System.out.println("Root1 is " + real_root + " + " + imaginary_root + "i");
            System.out.println("Root2 is " + real_root + " _ " + imaginary_root + "i");
        }
    }
}
