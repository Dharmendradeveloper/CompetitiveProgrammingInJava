package competitiveprogramming;

public class PrintEvenNumber {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3, 6, 10, 9, 8, 7};
        printOnlyEvenNumber(arr);
    }
    private static void printOnlyEvenNumber(int arr[]) {
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 0)
                System.out.print(" " + i);
        }
    }
}

