import java.util.*;

class Factorial {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println(result);
    }

    // TODO: Implement this method
    static int factorial(int n) {

        if(n<=1)
        {
            return 1;
        }
        return n*(factorial(n-1));
    }
}