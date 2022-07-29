package competitiveprogramming;

public class PrintFactorial {
    public static void main(String[] args) {
        System.out.println(printFactorial(10));
    }
    private static int printFactorial(int n){
        if (n==0||n==1)
            return 1;
        return n*printFactorial(n-1);
    }
}
