class Solution {
    public int reverse(int x) {
        
//         long rev = 0;
        
//         while(x!=0){
//             rev = rev * 10+(x%10);
//             x=x/10;
//         }
//         if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
//             return 0;
//         }
//         return (int)rev;
        boolean isNegative = x<0;
 if(isNegative){
 x = x*-1;
 }
 long rev = 0;
 while(x>0){
 rev = rev*10 + (x%10);
 if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE) return 0;
 x /= 10;
 }
 return isNegative ? (int)rev*-1 : (int)rev;
    }
}