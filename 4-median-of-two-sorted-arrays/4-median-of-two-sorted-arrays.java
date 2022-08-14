class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int x = nums1.length;
        int y = nums2.length;
        int arr[] = new int[x+y];
        
        for(int i=0;i<x;i++){
            arr[i] = nums1[i];
        }
        int k =0;
        
        for(int i=x;i<x+y;i++){
            arr[i] = nums2[k++];
        }
        
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++){
                
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        double res = 0;
        
        if(arr.length%2==1)
        {
            res = arr[arr.length/2]/1.0;
        }
        else
        {
            res = (arr[(arr.length/2)-1]+arr[arr.length/2])/2.0;
        }
        return res;
        
    }
}