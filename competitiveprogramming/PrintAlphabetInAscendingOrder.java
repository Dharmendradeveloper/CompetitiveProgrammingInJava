package competitiveprogramming;

public class PrintAlphabetInAscendingOrder {

    public static void main(String[] args) {
        printAlphabetInAscendingOrder();
    }

    private static void printAlphabetInAscendingOrder(){
        String str = "abdfacbhdzzzxxxyyyrf";
        int min = 0;
        int index = 0;
        char[] ch = str.trim().toLowerCase().toCharArray();
        for (int i=0;i<ch.length;i++){
             min = ch[i];
             index = i;
             for (int j=i;j<ch.length-1;j++){
                 if (min>ch[j+1]){
                     min = ch[j+1];
                     index = j+1;
                 }else {
                     // SKIP
                 }
             }// Inner loop
            ch[index] = ch[i];
             ch[i] = (char) min;
            System.out.println(" "+ch[i]);
        }
    }
}
