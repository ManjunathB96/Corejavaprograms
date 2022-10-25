package com_bridegelabz_basicprograms;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println(" Enter a number to find Factor:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int evencount = 0;
        int number = 1;
        while (evencount < value) {
            if (number % 2 == 0) {
                int factorcount = 0;
                for (int i = 2; i <= value; i++) {
                    if (number % i == 0) {
                        factorcount++;
                    }
                    evencount++;
                    System.out.println(number);
                }
            }
            number++;
        }
    }
}
