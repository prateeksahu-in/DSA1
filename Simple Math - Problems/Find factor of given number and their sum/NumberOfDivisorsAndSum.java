import java.util.*;


class NumberOfDivisorsAndSum{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = numberOfDivisorsAndSum(n);
        System.out.println(ans[0] + " " + ans[1]);
    }

    // TODO: Implement this method
    static int[] numberOfDivisorsAndSum(int n){

        int sum =0,count=0;

        for(int i =1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum +=i;
                count++;
            }
        }

        int[] a = {count,sum};
        return a;
    }
}
