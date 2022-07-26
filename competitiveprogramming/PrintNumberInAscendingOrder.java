package competitiveprogramming;

class PrintNumberInAscendingOrder {

    public static void main(String[] args) {
        printNumberInAscendingOrder();
    }
    private static void printNumberInAscendingOrder()
    {
        int arr[] = {90,8,8,9,70,100,5,5,6,7};
        int min = 0;
        int index = 0;

        for (int i=0;i< arr.length;i++)
        {
            min = arr[i];
            index = i;
            for (int j=i;j< arr.length-1;j++)
            {
                if (min>arr[j+1])
                {
                    min = arr[j+1];
                    index = j+1;
                }else {
                    // Skip
                }
            }// Inner loop
            arr[index] = arr[i];
            arr[i] = min;
            System.out.println(arr[i]);
        }// Outer loop
    }
}