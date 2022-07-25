package competitiveprogramming;

public class PrintUniqueCharacter
{

    public static void main(String[] args)
    {
        printUniqueCharacter();
    }

    private static void printUniqueCharacter()
    {
        String name = "Rama ka raj aa gya";
        String str = name.trim().toLowerCase();
        char[] ch = str.toCharArray();
        int isAlreadyCharCounted = 0;
        int count = 0;

        // Creating two for loop
        for (int i=0;i<ch.length;i++)
        {
            for (int j=0;j<ch.length;j++)
            {
                if(i==j)
                {
                    count++;
                }
                else
                {
                    if(str.charAt(j) == ch[i])
                    {
                        if(j<i)
                        {
                            isAlreadyCharCounted++;
                            break;
                        }
                        count++;
                    }
                    else
                    {
                        // To compare unique character
                    }
                }
            }// Inner Loop
            // Print the unique character
            if(isAlreadyCharCounted>=1)
                isAlreadyCharCounted = 0;
            else
                if(count>=2)
                {
                   // To print duplicate character
                }
                else
                    System.out.println("Unique char is "+ch[i] +" count "+count);
                count =0;
        }// Outer Loop
    }
}
