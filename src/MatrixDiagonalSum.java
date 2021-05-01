
public class MatrixDiagonalSum {
public int diagonalSum(int[][] mat) {
        
        int count=0;
        int n=mat.length;
        int j=n-1;
        for(int i=0;i<n && j>=0 ;i++)
        {
            count=count+mat[i][i]+mat[i][j];
            j--;
        }
        if(n%2!=0)
            count=count-mat[n/2][n/2];
        return count;
    }
}
