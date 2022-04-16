import java.util.*;

class FindElementQuery {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int q = sc.nextInt();

        while (q-- > 0) {

            int x = sc.nextInt();
            int result = findElementQuery(n, arr, x);

            System.out.println(result);

        }

    }

    // TODO: Implement this method
    static int findElementQuery(int n, int[] arr, int x) {

        for(int i = 0;i<n;i++)
        {
            if(arr[i]<=x)
            {
                if(arr[i]==x)
                {
                    return i;
                }
            }
            else
            {
                return -1;
            }
        }
        return -1;
    }
}
