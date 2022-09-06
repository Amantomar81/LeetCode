class Solution {
    public int[] twoSum(int[] nums, int target) {
        
//         int arr[] = new int[2];
        
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int sum = nums[i] + nums[j];
                
//                 if(sum == target){
//                    arr[0] = i;
//                     arr[1] = j;
                    
//                 }
//             }
//         }
//         return arr;
        
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No two sun solution");
    }
}