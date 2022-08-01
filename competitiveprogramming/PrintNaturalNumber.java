package competitiveprogramming;

public class PrintNaturalNumber {

    public static void main(String[] args) {
        System.out.println(" "+findNaturalNumber(10));
    }

    private static int findNaturalNumber(int n) {
        return n * (n + 1) / 2;
    }
}
