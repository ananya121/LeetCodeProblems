import java.util.Arrays;

public class MaximumNumberOfBallsInABox {
	
	public static void main(String[] args) {
		System.out.println(countBalls(1,10));
	}
	public static int  countBalls(int lowLimit, int highLimit) {
        int a[]=new int[46];
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int count =sumDigits(i);
            a[count]++;
        }
        Arrays.sort(a);
        return a[a.length-1];
    }
    
    public static int sumDigits(int num)
    {
        int temp=num;
        int sum=0;
        int a;
        while(temp>0)
        {
            a=temp%10;
            sum=sum+a;
            temp=temp/10;
        }
        return sum;
        
    }
}
