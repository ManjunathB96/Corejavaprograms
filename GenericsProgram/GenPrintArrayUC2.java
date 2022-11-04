package GenericsProgram;

public class GenPrintArrayUC2 {
    public static <E> void toPrint(E[] inputArray){
        for (E element : inputArray){
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[]  doubleArray = {2.1, 3.2, 5.8,6.8};
        Character[] charArray= {'M','A','N','J','U'};

        GenPrintArrayUC2.toPrint(intArray);
        GenPrintArrayUC2.toPrint(doubleArray);
        GenPrintArrayUC2.toPrint(charArray);
    }
}
