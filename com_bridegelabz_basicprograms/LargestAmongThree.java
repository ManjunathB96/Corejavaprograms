package com_bridegelabz_basicprograms;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        System.out.println("Enter the Three Numbers as input");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(+num1 +"  " +"Is Greater Than other Two Numbers");
            } else {
                System.out.println(+num3 +"   "+ "Is Greater Than other Two Numbers");
            }
        }
          else{

            if(num2 > num3) {
                System.out.println(+num2+"   "+ "Is Greater Than other Two Numbers");
            }
            else {
                System.out.println(+num3+"    " + "Is Greater Than other Two Numbers");
            }
        }

    }
}

