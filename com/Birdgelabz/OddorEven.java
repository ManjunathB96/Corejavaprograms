package com.Birdgelabz;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("The given number is :"+ num +"  "+"Even Number" );
        }
        else {
            System.out.println("The given number is :"+ num + "  "+"Odd Number");
        }
    }
}
