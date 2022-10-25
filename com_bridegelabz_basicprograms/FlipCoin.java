package com_bridegelabz_basicprograms;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int count = 1;
        double random = 0.0;

        System.out.println("Enter a number to Flip Coin");
        Scanner s = new Scanner(System.in);
        int flips = s.nextInt();

        while (count <= flips) {

            random = Math.random();
            System.out.println(count+"  "+random);

            if (random < 0.5){
                heads++;
                System.out.println("heads");

            }
            else {
                tails++;
                System.out.println("tails");
            }
            count++;

        }
        System.out.println();
        System.out.println("Number of Heads : "+heads);
        System.out.println("Number of tails : "+tails);

        double percentage = (double) heads/flips*100;
        double percentage1 = (double) tails/flips*100;

        System.out.println("Percentage of Heads : "+percentage);
        System.out.println("Percentage of Tails : "+percentage1);

    }
}
