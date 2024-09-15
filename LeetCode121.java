package LeetCodeProblems;

public class LeetCode121 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int profit=0;
        int buy_price=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(buy_price>prices[i])
            {
                buy_price=prices[i];
            }
            else {
                int cur_profit=prices[i]-buy_price;
                profit=Math.max(profit,cur_profit);
            }
        }
        return profit;
    }
}
