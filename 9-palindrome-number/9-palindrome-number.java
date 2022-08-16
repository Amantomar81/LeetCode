class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int reverseNum = 0;
        while(x>reverseNum){
            int pop = x%10;
            reverseNum = reverseNum * 10+ pop;
            x = x/10;
            
        }
        return x == reverseNum || x == reverseNum/10;
    }
}