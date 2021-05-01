
public class FindNUniqueIntegersSumUpToZero {

	public int[] sumZero(int n) {
        int ret[]=new int[n];
     
        int i=0;
        if(n%2!=0)
        {
            ret[i]=0;
            n--;
            i++;
        }
        
        int num=501;
        while(n>0)
        {
            ret[i]=num;
            ret[i+1]=-(num);
            i=i+2;
            n=n-2;
            num--;
        }
        return ret;
            
    }
}
