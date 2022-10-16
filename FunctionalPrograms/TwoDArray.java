package FunctionalPrograms;

import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Enter The Rows and Column Size :");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int number[][] = new int[rows][cols];

        //Input
        for (int i=0; i<rows; i++){
            for(int j =0; j<cols; j++){
                number[i][j] = sc.nextInt();

            }
        }
            //Output
        for (int i=0; i<rows; i++){
            for(int j =0; j<cols; j++){
                System.out.println(number[i][j] +"    ");

            }
        }
        System.out.println();

    }
}
