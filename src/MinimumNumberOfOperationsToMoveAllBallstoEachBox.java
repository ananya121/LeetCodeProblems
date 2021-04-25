
public class MinimumNumberOfOperationsToMoveAllBallstoEachBox {

	public static void main(String[] args) {
		// Problem Description
		//Optimised Solution
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
        int left[]= new int[n];
        int right[]= new int [n];
        
        int count=boxes.charAt(0)-'0';
        for(int i=1;i<n;i++)
        {
            left[i]=left[i-1]+count;
            count = count+ (boxes.charAt(i)-'0');
        }
        
        count = boxes.charAt(n-1)-'0';
         for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+count;
            count = count+(boxes.charAt(i)-'0');
        }
        
        for(int i=0;i<n;i++)
        {
            answer[i]= left[i]+right[i];
        }
        return answer;
    }
}
