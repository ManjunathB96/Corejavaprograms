package logical_programs;

import java.util.*;

public class PerfectNumber {
    public static void main(String args[]) {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int sum = 0;
        for(int i=1; i<=num/2; i++){
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        System.out.println("factors of num :" +sum);

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else
            System.out.println(num + " is not a perfect number.");
    }
}

