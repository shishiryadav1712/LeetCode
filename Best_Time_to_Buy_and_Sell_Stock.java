// Best Time to Buy and Sell Stock
class Solution {
    public int maxProfit(int[] prices) {
        int minP=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<=prices.length-1; i++){
            if(prices[i]<minP){
                minP=prices[i];
            }
            else if(prices[i]-minP>profit){
                profit=prices[i]-minP;
            }
        }
        return profit;
        
    }
}