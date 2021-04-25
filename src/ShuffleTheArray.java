
public class ShuffleTheArray {

	public static void main(String[] args) {
		// Problem Description
		/**
		 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

			Return the array in the form [x1,y1,x2,y2,...,xn,yn].
		 */
		int nums[]= new int[] {1,2,3,4};
		int shuffle_array[]=shuffle(nums,nums.length/2);
		for(int i : shuffle_array )
			System.out.println(i);

	}

	public static int[] shuffle(int[] nums, int n) 
    {
        int pointer1 = 0;
        int pointer2= n;
        int shuffled_array[] = new int[2*n];
        int i=0;
        while(pointer1<n)
        {
            shuffled_array[i]= nums[pointer1];
            shuffled_array[i+1]= nums[pointer2];
            i=i+2;
            pointer1 = pointer1 + 1;
            pointer2 = pointer2 + 1;
        }
        
        return shuffled_array;
        
    }
}
