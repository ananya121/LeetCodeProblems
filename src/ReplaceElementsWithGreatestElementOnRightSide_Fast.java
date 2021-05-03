
public class ReplaceElementsWithGreatestElementOnRightSide_Fast {
	public int[] replaceElements(int[] arr) {
        int n=arr.length;
        if(n==1)
        {
            arr[0]=-1;
            return arr;
        }
        int max=Math.max(arr[n-1],arr[n-2]);
        arr[n-2]=arr[n-1];
        for(int i=n-3;i>=0;i--)
        {
            int temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
            
        }
        arr[n-1]=-1;
        return arr;
    }
}
