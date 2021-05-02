
public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
        int r[]=new int[A.length];
        int i=0;
        int j=A.length-1;
        for(int k=0;k<A.length;k++)
        {
            if(A[k]%2!=0)
            {
                r[j]=A[k];
                j--;
            }
            else
            {
                r[i]=A[k];
                i++;
            }
        }
        return r;
    }
}
