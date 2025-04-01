// Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
      int temp=0;
      int sum=0;  
    for(int i =0;i<=accounts.length-1;i++){
        for(int j=0; j<=accounts[i].length-1;j++){
             sum=sum+accounts[i][j];
        }
        if (temp<=sum){
            temp=sum;
        }
        sum=0;
    }
      return temp;  
    }
}