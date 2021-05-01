
public class FindNumbersWithEvenNumberOfDigits {
	 public int findNumbers(int[] nums) {
	        int count=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(find_length(nums[i])%2==0)
	                count++;  
	        }
	        return count;
	    }
	    
	    public static int find_length(int num)
	    {
	        int temp=num;
	        int length=0;
	        while(temp>0)
	        {
	            length++;
	            temp=temp/10;
	        }
	        return length;
	    }
}
