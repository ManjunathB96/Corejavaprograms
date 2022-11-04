package GenericsProgram;

public class PrintArrayUC1 {
    public static void toPrint(Integer[] inputArray) {
        for (int element : inputArray) {
            System.out.printf("%s", element);

        }
        System.out.println();
    }

    public static void toPrint(Double[] inputArray) {
        for (double element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void toPrint(Character[] inputArray) {
        for (char element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void toprint(String[] inputarray) {
        for (String element : inputarray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray= {"Manjunath Belagavi"} ;

        PrintArrayUC1.toPrint(intArray);
        PrintArrayUC1.toprint(strArray);
    }
}

