package com_bridegelabz_basicprograms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double result = 0.0;

          while (num>0){                                 // for (int i = num; i > 0; i--) {
            result = result + (double) 1 / num;
             num--;
             System.out.println(result +" ");
             }

            System.out.println();
            System.out.println("harmonic series of a Nummber is :" + result);
        }

    }

