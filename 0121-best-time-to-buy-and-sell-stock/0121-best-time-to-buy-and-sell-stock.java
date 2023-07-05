class Solution {
    public int maxProfit(int[] prices) {
        int profit=0, b=0;
        for(int i=0;i<prices.length;i++){

            if(prices[i]-prices[b]<0){
                b=i;
            }else if(prices[i]-prices[b]>profit){
                profit=prices[i]-prices[b];
            }
        }
        return profit;
    }
}