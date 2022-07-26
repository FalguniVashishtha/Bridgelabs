package com.bridgelabz.assignment.voval;
import java.util.Scanner;

public class VowalConstant {
    public static void main(String[] args) {
        char[] s = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet to check");
        char ch = sc.next().charAt(0);
        for(int i = 0; i < s.length; i++) {
            if(ch == s[i]) {
                count = 1;
            }
        }
        if(count == 1) {
            System.out.println("The alphabet is Vowel.");
        }
        else {
            System.out.println("The alphabet is Constant.");
        }
    }
}
