import java.util.*;

class FindLargestNumber {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float result = findLargestNumber(a, b, c);

        if (result - (int) result == 0.0)
            System.out.println((int) result);
        else
            System.out.println(result);

    }

    // TODO: Implement this method
    static float findLargestNumber(float a, float b, float c) {

        if(a>b && a>c)
        {
            return a;
        }
        else if(b>c && b>a)
        {            
            return b;
        }
        else if(c>a && c>b)
        {
            return c;
        }
        else if(a == b && b==c)
        {
            return a;
        }
        return a;
    }
}
