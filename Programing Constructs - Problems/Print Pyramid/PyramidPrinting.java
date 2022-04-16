import java.util.*;

class PyramidPrinting {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] pattern = pyramidPrinting(n);

        for (int i = 0; i < n; i++)
            System.out.println(pattern[i]);

    }

    // TODO: Implement this method
    static String[] pyramidPrinting(int n) {
        
        String str="";
        for(int i = 0;i<=n;i++)
        {
            str +="*";
        }
        return str;
    }
}