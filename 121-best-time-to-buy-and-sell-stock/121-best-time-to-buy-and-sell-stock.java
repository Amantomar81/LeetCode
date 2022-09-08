class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        
        // int left[] = new int[n];
        // int right[] = new int[n];
        // left[0] = prices[0];
        // right[n-1] = prices[n-1];
        // for(int i=1;i<n;i++){
        //     left[i] = Math.min(left[i-1], prices[i]);
        // }
        // for(int i=n-2;i>=0;i--){
        //     right[i] = Math.max(right[i+1], prices[i]);
        // }
        // int m = 0;
        // for(int i=0;i<n;i++){
        //     m = Math.max(m, right[i]-left[i]);
        // }
        // return m;
  
        
        int l = Integer.MAX_VALUE;
        int p = 0;
        
        for(int i=0;i<n;i++){
            if(prices[i]<l){
              l = prices[i];
            }
             p = Math.max(prices[i] - l , p);
        }
         return p;
    }
}