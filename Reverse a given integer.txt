import java.util.*;

class ReverseNum {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);

    }

    // TODO: Implement this method
    static int reverseNum(int num) {

        //int digitPlace = 1;
        int revDigit =0;
        int temp = num;
        if(num<=9)
        {
            return num;
        }

        while(temp != 0)
        {
            revDigit= revDigit + (temp%10);
            temp = temp/10;
            if(temp != 0)
            {
                revDigit = revDigit*10;
            }
        }
        //System.out.println(revDigit);
        return revDigit;

    }
}