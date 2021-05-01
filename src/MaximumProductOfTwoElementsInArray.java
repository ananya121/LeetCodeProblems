
public class MaximumProductOfTwoElementsInArray {
	
	 public int maxProduct(int[] nums) {
	     int firstMax = 0, secondMax =0;
	        for(int i=0; i<nums.length; i++){
	            if(firstMax < nums[i]){
	                secondMax = firstMax;
	                firstMax = nums[i];
	            } else if(secondMax < nums[i]) {
	                secondMax = nums[i];
	            }
	        }
	        return (firstMax-1)*(secondMax-1);   
	    }
}
