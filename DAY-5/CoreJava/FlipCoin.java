package com.bridgelabz.assignment.flipcoin;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int head = 0;
        int tail = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times you want to flip a coin?");
        int number = sc.nextInt();
        for(int i=0; i<number; i++) {
            double randomValue = Math.random();
            System.out.println(randomValue);
            if(randomValue < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        System.out.println("number of head is" + " " + head);
        System.out.println("number of tail is" + " " + tail);
        int percentage =  ((head * 100) / number);
        System.out.println("percentage of head is" + " " + percentage);
        int percentage1 =  ((tail * 100) / number);
        System.out.println("percentage of tail is" + " " + percentage1);
    }
}
