import java.util.*;

class ModularExponentiation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = modularExponentiation(x, n);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int modularExponentiation(int x, int n) {
       
        //System.out.println(x+" "+n);
        //System.out.println(Math.pow(x, n));
        if(x == 0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 1;
        }
        long constVar1 = (powerX(10, 9)+7);
        long result = powerX(x, n)%constVar1;

        if(x>powerX(10, 9))
        {   
            //System.out.println("True");
            result = (x%powerX(10, 9));
        }

        return (int)result;
        
    }

    static long powerX(int x,int n)
    {
        //System.out.println(x+" "+n);
        long power = 1;
        for(int i=1;i<=n;i++)
        {
            power *= x;
        }
        return power;
    }
}