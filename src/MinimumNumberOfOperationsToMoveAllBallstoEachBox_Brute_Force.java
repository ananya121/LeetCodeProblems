
public class MinimumNumberOfOperationsToMoveAllBallstoEachBox_Brute_Force 
{
	public static void main(String[] args) {
		// Problem Description
		//Brute Force Solution
		/**
		 *  You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.

				In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1. Note that after doing so, there may be more than one ball in some boxes.
				
				Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.
				
				Each answer[i] is calculated considering the initial state of the boxes.
		 */
		String boxes="110";
		
		int min_operations[]=minOperations(boxes);
		for(int i : min_operations )
			System.out.println(i);
	}
    
	public static int[] minOperations(String boxes)
    {
        
		int n = boxes.length();
        int answer[]= new int[n];
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && boxes.charAt(j)=='1')
                    count = count + Math.abs(i-j);
            }
            answer[i]=count;
        }
        return answer;
    }
}
