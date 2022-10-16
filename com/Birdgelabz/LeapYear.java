package com.Birdgelabz;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year to find leap year or not");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        if (number%4 == 0){
            System.out.println("Number is a leap year :"+number);
        }
        else {
            System.out.println("Number is not a leap year");
        }
    }
}
