//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            System.out.println(ob.countWaystoDivide(N, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// User function Template for Java

class Solution {
    public int countWaystoDivide(int N, int K) {
        // Code here
        /*int arr[] = new int[N];
        for(int i=0;i<N;i++) arr[i] = i+1;
        
        return help(0,arr,N,K,0);*/
        return help(N,K,1,new Integer[N+1][K+1][N+1]);
    }
        public  int help(int sum,int k,int previousElement,Integer[][][] dp) 
        {
            if(k==0 && sum==0) return 1;
            if(k==0 || sum<=0) return 0;
            if(dp[sum][k][previousElement]!=null) return dp[sum][k][previousElement];
        
            int ans=0;
            for(int i=previousElement;i<=sum;i++) 
            {
                ans+=help(sum-i,k-1,i,dp);
            }
            return dp[sum][k][previousElement]=ans;
    }
  /*  public int help(int i,int arr[],int N,int K,int sum)
    {
        if(K==0)
        {
            if(sum==N)
            {
                return 1;
            }
            else
            {
                 return 0;
            }
        }
        if(i== arr.length) return 0;
        return help(i,arr,N,K-1,sum+arr[i]) + help(i+1,arr,N,K,sum);
    }*/
}