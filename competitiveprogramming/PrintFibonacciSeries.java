package competitiveprogramming;

public class PrintFibonacciSeries {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.print(" "+printFibonacciSeries(i));
    }
    private static int printFibonacciSeries(int num) {
        if (num == 0||num==1)
            return num;
        return printFibonacciSeries(num - 1) + printFibonacciSeries(num - 2);
    }
}
