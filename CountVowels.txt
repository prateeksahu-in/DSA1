import java.util.*;

class CountVowels {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vowels = countVowels(str);
        System.out.println(vowels);
    }

    // TODO: Implement this method
    static int countVowels(String str) {

       
        int counter =0;
        String vowel = "aeiouAEIOU";
        for(int i = 0; i<str.length();i++)
        {
            for(int j = 0;j<10;j++)
            {
                if(str.charAt(i)==vowel.charAt(j))
                {
                    counter++;
                }
            }

        }
        return counter;
    }
}