
public class Number_of_Good_Pairs_Solution_2 {

	public static void main(String[] args) {
		
		// Problem Description
		/**
		 * Given an array of integers nums.

			A pair (i,j) is called good if nums[i] == nums[j] and i < j.
			
			Return the number of good pairs
		 */
		int nums[]= new int[] {1,2,3,1,1,3};
		System.out.println(numIdenticalPairs(nums));

	}
	
	public static int numIdenticalPairs(int[] nums) 
    {
		
        int n=nums.length;
        int count =0;
        for(int i=0 ; i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
        
    }

}
