
public class CountNegativeNumbersinaSortedMatrix {
	public int countNegatives(int[][] grid) {
        int count=0;
        int l,r;
        
        for(int i=0;i<grid.length;i++)
        {
           l=0;
           int length = grid[i].length;
           r= length-1;
           int index=-1;
           while(l<=r)
           {
               int m=l+(r-l)/2;
               if(l==r && grid[i][l]<0)
                   index=l;
               if(grid[i][m]<0)
                   r=r-1;
               else
                   l=l+1;
           }
            if(index!=-1)
                count =count + (length-index);

        }
        return count;
    }
}
