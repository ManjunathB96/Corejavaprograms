package com.Birdgelabz;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a First Number :");
        int m = s.nextInt();
        System.out.println("Enter a Second Number :");
        int n = s.nextInt();
        temp = m;
        m = n ;
        n = temp;
        System.out.println("After Swapping ");
        System.out.println("First number"+m);
        System.out.println("Second Number"+n);

    }
}
