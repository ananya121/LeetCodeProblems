import java.util.Arrays;

public class Maximum_Ice_Cream_Bars {

	public static void main(String[] args) {
		/**
		 * It is a sweltering summer day, and a boy wants to buy some ice cream bars.

			At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 
			
			Return the maximum number of ice cream bars the boy can buy with coins coins.
			
			Note: The boy can buy the ice cream bars in any order.
		 */
		int costs[] = new int[] {1,3,2,4,1};
		int coins = 7;
		System.out.println(maxIceCream(costs,coins));

	}
	
	public static int maxIceCream(int[] costs, int coins) 
    {
        int count = 0;
        Arrays.sort(costs);
        int n =costs.length;
        for(int i=0 ; i<n && coins > 0; i++)
        {
            if(costs[i]<= coins)
            {
                coins=coins - costs[i];
                count =count + 1;
            }
        }
        
        return count;
        
        
        
    }

}
