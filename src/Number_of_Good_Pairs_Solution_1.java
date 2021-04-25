import java.util.HashMap;
import java.util.Map;

public class Number_of_Good_Pairs_Solution_1 {

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
	public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int count = 0;
        
        for(Integer num : nums)
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        
        for(Integer currCount : countMap.values())
            count += currCount * (currCount-1)/2;
        
        return count;
    }

}
