import java.util.*;

class DiagonalSum {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        }

        int result = diagonalSum(n, a);
        System.out.println(result);
    }

    // TODO: Implement this method
    static int diagonalSum(int n, int[][] a) {
        
        int sumOfDiagonal =0;
        for(int i =0 ;i<n;i++)
        {
            sumOfDiagonal += a[i][i];         
        }
        return sumOfDiagonal;
    }
}
