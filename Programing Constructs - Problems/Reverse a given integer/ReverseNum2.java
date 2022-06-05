import java.util.*;

class ReverseNum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);

    }
    static int reverseNum(int num) {

        int revNum = 0;
        while(num > 0)
        {
            revNum = revNum*10 + (num%10);
            num = num/10;
        }
        return revNum;

    }
}