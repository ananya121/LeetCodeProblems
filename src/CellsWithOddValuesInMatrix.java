
public class CellsWithOddValuesInMatrix {

	public int oddCells(int m, int n, int[][] indices) {
        int mat[][]=new int[m+1][n+1];
        int l=indices.length;
        for(int i=0;i<l;i++)
        {
            int r=indices[i][0];
            int c=indices[i][1];
            for(int j=0;j<n;j++)
            {
                mat[r][j]=mat[r][j]+1;
            }
            for(int k=0;k<m;k++)
            {
                mat[k][c]=mat[k][c]+1;
            }
        }
        int count=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }
}
