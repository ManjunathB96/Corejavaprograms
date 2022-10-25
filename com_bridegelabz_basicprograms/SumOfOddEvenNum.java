package com_bridegelabz_basicprograms;

import java.util.Scanner;

public class SumOfOddEvenNum {
    public static void main(String[] args) {
        int n, sumE=0, sumO=0;

        System.out.println("enter the size n  in array :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the elements of array");

        //input for(i = 0 to n)
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        //output
        for (int i=0; i<n; i++){
            if (a[i] % 2 == 0){
                sumE = sumE+a[i];
            }
            else {
                sumO=sumO+a[i];
            }
        }
        System.out.println("sum of even numbers : "+sumE);
        System.out.println("sum of odd numbers : " +sumO);
    }
}
