
public class DecompressRunLengthEncodedList {

	public static void main(String[] args) {
		// Problem description
        /**
         * We are given a list nums of integers representing a list compressed with run-length encoding.

			Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
			
			Return the decompressed list.
         */
       int nums[]= new int[] {1,2,3,4};
       int de_compressed[]=decompressRLElist(nums);
       for(int i: de_compressed)
       {
    	   System.out.println(i);
       }
       
	}
	public static int[] decompressRLElist(int[] nums) 
    {
        int n =nums.length;
        int m=0;
        for(int i=0;i<n;i=i+2)
        {
            m=m+nums[i];
        }
        int de_compress[]= new int[m];
        int j=0;
        for(int i=0 ; i<n/2;i=i+1)
        {
            int freq=nums[2*i];
            int val=nums[2*i+1];
            while(freq-->0)
            {
                de_compress[j]=val;
                j++;
                
            }
        }
        
        return de_compress;
        
    }

}
