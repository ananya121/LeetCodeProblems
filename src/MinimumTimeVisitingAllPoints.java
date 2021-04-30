
public class MinimumTimeVisitingAllPoints {
    public int minTimeToVisitAllPoints(int[][] points) 
    {
        int rows=points.length;
        
        int time=0;
        for(int i=1;i<rows;i++)
        {
            int left_cord= Math.abs(points[i-1][0]-points[i][0]);
            int right_cord= Math.abs(points[i-1][1]-points[i][1]);
            while(left_cord>0 && right_cord>0)
            {
                left_cord =left_cord-1;
                right_cord=right_cord-1;
                time=time+1;
                //diagonal move
            }
            while(left_cord>0)
            {
                //horizontal move
                left_cord =left_cord-1;
                time=time+1;
            }
             while(right_cord>0)
            {
                //horizontal move
                right_cord =right_cord-1;
                time=time+1;
            }
        }
        
        return time;
        
    }
}