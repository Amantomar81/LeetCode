//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int []ans= obj.sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int[] sortArr(int[] arr, int n) 
    { 
        // code here
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++){
        //      if(arr[i]>arr[j]){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        //       }   
        //     }
        // }
        Arrays.sort(arr);
       return arr;
    }
} 