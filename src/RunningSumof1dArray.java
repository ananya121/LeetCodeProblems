
public class RunningSumof1dArray {

	public static void main(String[] args) {
		// Problem Description
		/**
		 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

			Return the running sum of nums.
		 */
		int nums[]= new int[] {1,2,3,4};
		int running_sum[]=runningSum(nums);
		for(int i : running_sum )
			System.out.println(i);

	}
	
	public static int[] runningSum(int[] nums)
    {
        int n=nums.length;
        int running_sum[]= new int[n];
        running_sum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            running_sum[i]=running_sum[i-1]+nums[i];
        }
        return running_sum;
    }

}
