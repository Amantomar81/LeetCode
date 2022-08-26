class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if(low<=high){
            int n = high-low;
            count = n/2;
            if(low%2!=0)
                count++;
            else if(high%2!=0)
                count++;
        }
        return count;
    }
}