import java.util.*;

class DiamondPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] pattern = diamondPrinting(n);

        for (int i = 0; i < 2 * n - 1; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    static String[] diamondPrinting(int n) {
        String[] pattern = new String[2 * n - 1];
        for (int i = 0; i < 2 * n - 1; i++)
        {
            pattern[i]="";
            if(i<n)
            {
                for(int j = 1;j<=n-i-1;j++)
                {
                    pattern[i] = pattern[i]+" ";
                }
                for(int j = 0;j<=i;j++)
                {
                    pattern[i] = pattern[i]+"* ";
                }
            }
            else
            {
                for(int j=1;j<=n-i;j++)
                {
                    pattern[i] = pattern[i]+" ";
                }
                for(int j=1;j<(n-(i-n));j++)
                {
                    pattern[i] = pattern[i]+"* ";    
                }

            }
            //System.out.println(i+" - "+ pattern[i]);
        }
            
        return pattern;
    }
}