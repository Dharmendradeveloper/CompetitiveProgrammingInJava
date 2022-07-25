package competitiveprogramming;

public class PrintDuplicate {
    public static void main(String[] args) {
        printDuplicate();
    }
    private static void printDuplicate(){
        String str1 = "Dharmendra KDumar";
        String str = str1.trim().toLowerCase();
        char[] ch = str.toCharArray();
        int alreadyAvailAlphabet = 0;
        int flag = 0;

        for (int i=0;i<ch.length;i++){
            for(int j=0;j<str.length();j++){
                if(j==i){
                    // Skip operation
                    flag++;
                }else {
                    if(str.charAt(j) == ch[i]){
                        // duplicate alphabet
                        if(j<i){
                            alreadyAvailAlphabet++;
                            break;
                        }
                        flag++;
                    }else {
                        // unique alphabet skip bcz of duplicate
                    }
                }
            }//inner loop
            if(alreadyAvailAlphabet>=1){
                alreadyAvailAlphabet=0;
            }else {
                if(flag >= 2) {
                    System.out.println("character "+ch[i]+" "+flag);
                    flag = 0;
                }else {
                    flag = 0;
                }
            }
        }//outer loop
    }
}





































