class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = -1;
        int l = -1;
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target && f == -1 ){
                f = i;
            }
             if(nums[i] == target){
                l = i;
            }
            
        }
        arr[0] = f;
        arr[1] = l;
        return arr;
    }
}
