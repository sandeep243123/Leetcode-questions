class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int k=money;
        for(int i=0;i<2;i++){
            money-=prices[i];
        }
        if(money<0)
            return k;
        else
            return money;
    }
}