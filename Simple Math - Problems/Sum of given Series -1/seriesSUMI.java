import java.util.*;

class SeriesSumI {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = seriesSumI(n);

        System.out.println(result);

    }

    // TODO: Implement this method
    static int seriesSumI(int n) {
        int a = 1,b=3;
        int result = 0;
        for(int i=0;i<n;i++)
        {
            result += a*b;
            a +=2;
            b +=2;
        }
        return result;
    }
}