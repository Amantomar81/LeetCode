class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                arr[i]=1;
            }
            else{
                arr[i] = arr[i-1]*nums[i-1];
            }
        }
        int prod = 1;
        for(int i=n-1;i>=0;i--){
            arr[i] = arr[i]*prod;
            prod = prod*nums[i];
        }
        return arr;
    }
}