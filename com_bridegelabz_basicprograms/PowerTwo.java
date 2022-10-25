package com_bridegelabz_basicprograms;

public class PowerTwo {
    public static void main(String[] args) {
        int num =Integer.parseInt(args[0]);
        int i=1;
        int powerOfTwo=2;
        while (i <=num){
            System.out.println(i+" ==> "+powerOfTwo);
            powerOfTwo = 2*powerOfTwo;
            i=i+1;
        }


    }
}

//Power of 2
//a Desc -> This program takes a command-line argument N and prints a table of the
//powers of 2 that are less than or equal to 2^N.
//b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
//c. Logic -> repeat until i equals N.
//d. O/P -> Print the year is a Leap Year or not.





//Example of power of any number

//  Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the base");
//        int base = sc.nextInt();
//        System.out.println("Enter exponent");
//        int exponent = sc.nextInt();
//
//        int expo = exponent;
//        long power = 1;
//
//        while (exponent != 0){
//            power = power*base;
//            --exponent;
//        }
//        System.out.println(base +" to the power " + expo + "  "+" is "+"  "+power);