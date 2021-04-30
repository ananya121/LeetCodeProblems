
public class Min_Opeartions_To_Make_Array_Increasing {
	public int minOperations(int[] nums) {
        int op=0;
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            max=Math.max(nums[i],nums[i-1]+1);
            if(nums[i]!=max)
            {
                int diff=Math.abs(nums[i-1]-nums[i]+1);
                op=op+diff;
                nums[i]=nums[i]+ diff;
            }
        }
        return op;
    }
}
