import java.util.*;


class NthFibonacciNumber{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nthFibonacciNumber(n);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int nthFibonacciNumber( int n){

        return LastFibonacci(n);
    }

    static int LastFibonacci(int n){
        
        if(n==0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return LastFibonacci(n-1)+LastFibonacci(n-2);
    }
}