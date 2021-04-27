import java.util.ArrayList;
import java.util.List;

public class QueriesOnPermutationWithKey {

	public static void main(String[] args) {
		// Problem Description
		/**
		 * Given the array queries of positive integers between 1 and m, you have to process all queries[i] (from i=0 to i=queries.length-1) according to the following rules:
				
				In the beginning, you have the permutation P=[1,2,3,...,m].
				For the current i, find the position of queries[i] in the permutation P (indexing from 0) and then move this at the beginning of the permutation P. Notice that the position of queries[i] in P is the result for queries[i].
				Return an array containing the result for the given queries.
		 */
		int m =5;
		int queries[]=new int[] {3,1,2,1};
		int result[]= processQueries(queries,m);
		for(int i:result)
		{
			System.out.println(i);
		}

	}
	
	
	    public  static int[] processQueries(int[] queries, int m) 
	    {
	        int n=queries.length;
	        int j=1;
	        int result[]=new int[n];
	        List<Integer> permute = new ArrayList<Integer>(m);
	        while(j<=m)
	        {
	            permute.add(j);
	            j++;
	        }
	        int k=0;
	        int index,element;
	        for(int i=0;i<n;i++)
	        {
	        	element=queries[i];
	            index=permute.indexOf(element);
	            result[k]=index;
	            k++;
	            permute.remove(index);
	            permute.add(0, element);
	               
	        }
	        return result;
	    }
	

}
