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
                    // Skip operation and count the character which has been appeared at least once 
                    flag++;
                }else {
                    if(str.charAt(j) == ch[i]){
                        // duplicate alphabet
                        if(j<i){
                            alreadyAvailAlphabet++;// Checking if the character has already been count then terminating the loop and proceeding at further character.
                            break;
                        }
                        flag++;
                    }else {
                        // Unique alphabet
                        // Skip
                    }
                }
            }//inner loop
            if(alreadyAvailAlphabet>=1){
                alreadyAvailAlphabet=0;// To avoid the repetitive count of character
            }else {
                if(flag >= 2) {// If the character has appeared more than one then print that character with no.of times appear
                    System.out.println("character "+ch[i]+" "+flag);
                    flag = 0;
                }else {
                    flag = 0;//If the character has appeared only once then make the flag=0;
                }
            }
        }//outer loop
    }
}





































