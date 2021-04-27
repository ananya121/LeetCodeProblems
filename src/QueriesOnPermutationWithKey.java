import java.util.ArrayList;
import java.util.List;

public class QueriesOnPermutationWithKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
