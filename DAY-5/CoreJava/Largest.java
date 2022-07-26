package com.bridgelabz.assignment.largest;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int number1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int number2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int number3 = sc.nextInt();
        int largest;
        largest = number1;
        if(number2 > largest) {
            largest = number2;
        }
        if(number3 > largest) {
            largest = number3;
        }
        System.out.println("The largest number among 3 numbers is " + largest);
    }
}
