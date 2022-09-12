class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
        int profit = 0;
        //start with index 1and compare the price
        //with previous day price & calculate profit if any
        for(int i=0;i<n-1;i++){
            if(prices[i+1]>prices[i]){
                profit += (prices[i+1] - prices[i]);
            }
        }
        return profit;
    }
}