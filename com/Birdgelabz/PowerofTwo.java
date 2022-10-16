package com.Birdgelabz;

import java.util.Scanner;

public class PowerofTwo {
    public static void main(String[] args) {
        int base,exponent,expo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        base = sc.nextInt();
        System.out.println("Enter exponent");
        exponent = sc.nextInt();

        expo = exponent;
        long power = 1;
        while (exponent != 0){
            power = power*base;
            --exponent;

        }
        System.out.println(base +" to the power " + expo + "  "+" is "+"  "+power);
    }
}
