
public class RichestCustomerWealth {

	public static void main(String[] args) {
		// Problem Description
		/**
		 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

			A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
		 */
		int accounts[][]= new int[][] {{1,5},{7,3},{3,5}};
         System.out.println(maximumWealth(accounts));
	}
	
	public static  int maximumWealth(int[][] accounts) 
    {
        int max_wealth = Integer.MIN_VALUE;
        int row = accounts.length; //rows
        int col = accounts[0].length; //columns
        int sum;
        for(int i=0;i<row;i++)
        {
            sum=0;
            for(int j=0;j<col;j++)
            {
                sum =sum+accounts[i][j];
            }
            max_wealth=Math.max(max_wealth,sum);
        }
        return max_wealth;
        
    }

}
