package FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double root1 = Math.sqrt((b*b)-4*a*c);
        root1 = -b + root1;
        root1 =root1/(2*a);

        System.out.println("X = "+ root1);

        double root2 = Math.sqrt((b*b)-4*a*c);
        root2 = -b - root2;
        root2 =root2/(2*a);

        System.out.println("X = "+ root2);

    }
}
