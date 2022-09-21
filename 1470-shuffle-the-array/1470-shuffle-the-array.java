class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int arr[] = new int[2*n];
        int j = n;
        int k=0;
        for(int i=0;i<n;i++){
           arr[k] = nums[i];
            k++;
            arr[k] = nums[j];
            j++;
            k++;
        }
        return arr;
    }
}