class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;
    int[] newArr = new int[n+1];
    for(int i = n-1; i >= 0; i--){
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    newArr[0] = 1;
    
    return newArr;
    }
}