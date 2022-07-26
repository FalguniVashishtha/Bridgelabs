package com.bridgelabz.assignment.array;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the array values");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D array values are: ");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
