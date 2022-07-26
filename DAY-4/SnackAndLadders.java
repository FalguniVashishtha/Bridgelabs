package com.bridgelabz.assignment.snackandladders;

public class SnackAndLadders {
    final static int src = 0;
    final  static  int dst = 100;
    public static void main(String[] args) {
        int position=0, diceRoll=0;
        while(position != dst)
        {
            diceRoll++;
            int diceNum = (int) (Math.random() * 10) % 6+1;
            int  option = (int) (Math.random() * 10) % 3;
            switch(option) {
                case 0:
                    System.out.println("No play");
                    position += 0;
                    break;
                case 1:
                    System.out.println("Ladder");
                    position += diceNum;
                    break;
                case 2:
                    System.out.println("Snake");
                    position -= diceNum;
                    break;
            }
            if (position == 100) {
                break;
            } else if (position > 100) {
                position -= diceNum;
                System.out.println("Not valid Dice Face. You are staying on same position.");
            } else if (position < 0) {
                position = src;
                System.out.println("You came back to start.");
            } else {
                System.out.println("New Position: " + position);
            }
        }
        System.out.println("You won, your position is: "+position);
        System.out.println("Number of times game played: "+diceRoll);
    }
}
