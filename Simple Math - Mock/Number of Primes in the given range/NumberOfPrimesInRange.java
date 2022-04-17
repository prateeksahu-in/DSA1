import java.util.*;

class NumberOfPrimesInRange {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = numberOfPrimesInARange(l, r);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int numberOfPrimesInARange(int l, int r) {

        int count = 0;
        for(int i=l;i<=r;i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        
        return count;

    }

    static boolean isPrime(int n){

        if(n<=1)
        {
            return false;
        }
        for(int i = 2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}