package com_bridegelabz_basicprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter a year to find leap year or not");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if (year % 4 == 0){
            System.out.println(+year+"   "+"  Is a Leap Year");
        }
        else {
            System.out.println(year+"   "+"  Is not a leap year");
        }
    }
}
