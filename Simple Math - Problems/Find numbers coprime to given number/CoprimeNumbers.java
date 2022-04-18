import java.util.*;

class CoprimeNumbers {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = coprimeNumbers(n);

        System.out.println(result);

    }

    // TODO: Implement this method
    static int coprimeNumbers(int n) {

        int count = 0;
        if(n==1)
        {
            return 1;
        }
        for(int i=1;i<n;i++)
        {
            if(isCoprime(i,n))
            {
                count++;
            }
        }
        return count;

    }
    static boolean isCoprime(int i,int n)
    {

        for(int j = 2;j<=i;j++)
        {
            if(i%j == 0 && n%j==0)
            {
                return false;
            }
        }
        return true;

    }


}