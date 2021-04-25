import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies 
{

	public static void main(String[] args) 
	{
		// Problem Statement
		/**
		 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

			For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.
		 */
		int candies[] = new int[] {2,3,5,1,3};
        int extraCandies = 3;
        
        System.out.println(kidsWithCandies(candies,extraCandies));

	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        int n = candies.length;
        
        int max_candies = candies[0];
        
         // Traverse array elements from second and
         // compare every element with current max  
         for (int i = 1; i < candies.length; i++)
             if (candies[i] > max_candies)
                 max_candies = candies[i];
        
        List<Boolean> output = new ArrayList<Boolean>();
        for(int i=0;i<n;i++)
        {
            if(candies[i] + extraCandies >= max_candies)
                output.add(true);
            else
                 output.add(false);

        }
        
        return output;
        
        
    }

}
