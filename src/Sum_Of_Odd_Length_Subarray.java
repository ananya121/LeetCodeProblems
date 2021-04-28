
public class Sum_Of_Odd_Length_Subarray {
    public int sumOddLengthSubarrays(int[] arr)
    {
        {
        // amking the array to store the sum of previous values (prefix sum)
        for(int i = 1; i < arr.length ; i++)
        {
            arr[i] += arr[i - 1]; 
        }
        int sum = arr[arr.length - 1];
        
        // now looping around the array using the size which will be always odd 
        int size = 3;
        while(size <= arr.length)
        {
            for(int j = size - 1; j < arr.length ; j++)
            {
                int i = j - size;
                sum += arr[j] - (i >= 0 ? arr[i] : 0);
            }
            
            size += 2;
        }
        return sum;
    }
    }
}