package com.Birdgelabz;

import java.util.Scanner;

public class QuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dividend :");
        int dividend = sc.nextInt();
        System.out.println("Enter a Divisor :");
        int divisor = sc.nextInt();

        int quotient = dividend/divisor;
        int reminder = dividend%divisor;

        System.out.println("Quotient is :"+quotient);
        System.out.println("Reminder is :"+reminder);
    }
}
