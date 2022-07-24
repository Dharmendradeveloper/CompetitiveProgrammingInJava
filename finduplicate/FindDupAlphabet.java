package finduplicate;

import java.sql.Time;
import java.util.Date;

public class FindDupAlphabet {

    public static void main(String[] args) {
        findDuplicate();
    }

    private static void findDuplicate(){
        String str1 = "green";
        String str = str1.toLowerCase();
        char[] charArray = str.toCharArray();
        int count = 0;
        long t1 = System.currentTimeMillis();
        for (int i=0;i<charArray.length;i++){//i=0 t0 n-1
                for (int j=0;j<charArray.length;j++){
                    if(charArray[i]==charArray[j]){//i=0
                        count++;
                    }
                }
            if (count <= 1) {
                System.out.println("character at index " + i + "is " + str.charAt(i));
            }
            count = 0;
        }// fo loop closed
        long t2 = System.currentTimeMillis()-t1;
        System.out.println("time taken too execute "+t2);
    }


}
