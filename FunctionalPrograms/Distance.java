package FunctionalPrograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        long x,y;
        double dist;

        x = Long.parseLong(args[0]);
        y = Long.parseLong(args[1]);


        dist = Math.sqrt(x*x + y*y);

        System.out.println(dist);
    }
}


   /* Write a program Distance.java that takes two integer command-line arguments x
        and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
        formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function */