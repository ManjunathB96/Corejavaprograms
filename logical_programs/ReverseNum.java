package logical_programs;

import java.util.Scanner;

interface InterfaceReverse {
    void show();

}

public class ReverseNum implements InterfaceReverse{
    @Override
    public void show() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] number = new int[rows][cols];

        //input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
                System.out.print("Input Values :=" + number[i][j]);
            }
        }
        System.out.println();
        //output
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print("Reverse of Input Values" + number[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        InterfaceReverse obj = new ReverseNum();
        obj.show();

    }
}
