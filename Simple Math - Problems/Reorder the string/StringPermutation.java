import java.util.*;

class StringPermutation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int permutation[] = new int[n];

        for (int i = 0; i < n; i++)
            permutation[i] = sc.nextInt();

        String result = stringPermutation(n, str, permutation);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String stringPermutation(int n, String str, int[] permutation) {

        char[] ch = new char[n];

        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(permutation[j]==i+1)
                {
                    ch[i] = str.charAt(j);
                }
            }
        }
        String string = new String(ch);
 
        return string;
    }
}