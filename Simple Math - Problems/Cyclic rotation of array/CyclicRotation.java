import java.util.*;

class CyclicRotation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int rotatedArr[] = cyclicRotation(n, arr, k);

        for (int j : rotatedArr)
            System.out.print(j + " ");

    }

    // TODO: Implement this method
    static int[] cyclicRotation(int n, int[] arr, int k) {

        int temp;

        for(int i = 1;i<=k;i++)
        {
            temp = arr[n-1];
            for(int j = n-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0] = temp;
        }

        return arr;

    }
}