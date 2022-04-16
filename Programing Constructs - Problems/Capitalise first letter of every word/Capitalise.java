import java.util.*;

class Capitalise {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String captStr = capitalise(str);
        System.out.println(captStr);
    }

    // TODO: Implement this method
    static String capitalise(String str) {
    boolean flagWord=false;
    char ch[] = str.toCharArray();
    for(int i = 0; i< str.length();i++)
    {
        
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
            {
                if(flagWord==false)
                {
                    
                    ch[i] = Character.toUpperCase(str.charAt(i));
                    //str.charAt(i) =.str.charAt(i) - 32;
                    flagWord =true;
                }
            }
            else if(str.charAt(i) >= 65 && str.charAt(i) <= 90){
                flagWord = true;
            }
            else{
                flagWord = false;
            }
    }
    String st = new String(ch);
    return st;


    }
}