// Best Time to Buy and Sell Stock II
class Solution {
    public int maxProfit(int[] prices) {
        int totalP=0;
        for(int i =1; i<prices.length;++i){
            int dailyP=Math.max(0,prices[i]-prices[i-1]);
            totalP=totalP+dailyP;
        }

        return totalP;
    }
}