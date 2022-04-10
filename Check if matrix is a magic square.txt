import java.util.*;

class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {

        int initSum = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++)
                initSum += grid[i][j];
        }
        //System.out.println(initSum);
        for (int i = 0; i < n; i++) {
            int sumRow=0,sumCol=0;
            for (int j = 0; j < n; j++)
                {
                    sumRow += grid[i][j];
                    sumCol += grid[j][i];
                }
                //System.out.println("sumRow"+i+" = "+sumRow);
                //System.out.println("sumCol"+i+" = "+sumCol);
                if(sumRow!=initSum || sumCol!=initSum)
                {
                    return "No";
                }
        }

        int sumDiagonalOne = 0, sumDiagonalTwo =0;
        for(int i =0;i<n;i++)
        {
            sumDiagonalOne += grid[i][i];
            sumDiagonalTwo += grid[i][n-1-i];
        }
        //System.out.println("sumD1 = "+sumDiagonalOne);
        //System.out.println("sumD2 = "+sumDiagonalTwo);
        if(sumDiagonalOne != initSum || sumDiagonalTwo != initSum)
        {
            return "No";
        }

        return "Yes";
    }
}