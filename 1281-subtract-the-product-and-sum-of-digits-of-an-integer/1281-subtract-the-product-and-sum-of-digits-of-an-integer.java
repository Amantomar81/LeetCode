class Solution {
    public int subtractProductAndSum(int n) {
        int p =1;
        int s =0;
        while(n>0){
          int x = n%10;
            p = p*x;
            s = s+x;
            n = n/10;
        }
        
        return p -s;
        
    }
}