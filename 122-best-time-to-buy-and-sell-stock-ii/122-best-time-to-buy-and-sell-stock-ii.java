class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
        int profit = 0;
        //start with index 1and compare the price
        //with previous day price & calculate profit if any
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}