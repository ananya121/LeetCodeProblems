import java.util.Arrays;

public class Subrectangle_Queries 
{

	public static void main(String[] args) 
	{
		//Problem Statement
		/**
		 * Implement the class SubrectangleQueries which receives a rows x cols rectangle as a matrix of integers in the constructor and supports two methods:
			
			1. updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)
			
			Updates all values with newValue in the subrectangle whose upper left coordinate is (row1,col1) and bottom right coordinate is (row2,col2).
			2. getValue(int row, int col)
			
			Returns the current value of the coordinate (row,col) from the rectangle.
		 */
		
		int rectangle[][]=new int[][] {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
		Subrectangle_Queries obj = new Subrectangle_Queries(rectangle);
		 
		 //obj.updateSubrectangle(row1,col1,row2,col2,newValue);
		obj.updateSubrectangle(0, 0, 3, 2, 5);
		//int param_2 = obj.getValue(row,col);
		int param_2 = obj.getValue(0,2);
		System.out.println(param_2);
	}
	
	int rect[][];
    public Subrectangle_Queries(int[][] rectangle) {
        rect = rectangle;
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) 
    {
        for (int i=row1;i<=row2;i++){
            Arrays.fill(rect[i],col1,col2+1,newValue);
        }

        
    }
    
    public int getValue(int row, int col) {
        return rect[row][col];
        
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */
	
	


