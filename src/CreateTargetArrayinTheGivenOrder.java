import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayinTheGivenOrder {

	public static void main(String[] args) {
		// Problem description
		/**
		 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:

			Initially target array is empty.
			From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
			Repeat the previous step until there are no elements to read in nums and index.
			Return the target array.
			
			It is guaranteed that the insertion operations will be valid.
		 */
		
		int nums[]=new int[] {0,1,2,3,4};
		int index[]=new int[] {0,1,2,2,1};
		int target[]=createTargetArray(nums,index);
		for(int i:target)
		{
			System.out.println(i);
		}
	}
		 public static int[] createTargetArray(int[] nums, int[] index) 
		    {
		        // store target
		        List<Integer> target = new ArrayList<>();
		        
		        
		        for (int i = 0; i < nums.length; i += 1) {
		            
		            
		            target.add(index[i], Integer.valueOf(nums[i]));
		        }
		        
		        return target.stream().mapToInt(i->i).toArray();
		    }

	}


