//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String str)
    {
        // code here
        int dp[] = new int[str.length()];
        dp[0] =1;
        int mod = 1000000007;
        for(int i=1; i<dp.length; i++){
            if(str.charAt(i-1)=='0' && str.charAt(i)=='0')
            {
                  dp[i]=0;
            }
            else if(str.charAt(i-1)=='0' && str.charAt(i)!='0'){
                dp[i] = dp[i-1]%mod;
            }
            else if(str.charAt(i-1)!='0' && str.charAt(i)=='0'){
                if(str.charAt(i-1)=='1' || str.charAt(i)=='2'){
                    if(i>=2)
                      dp[i] = dp[i-2]%mod;
                    else
                      dp[i] =1;
                }
                else{
                    dp[i] =0;
                }
            }
            else{
                dp[i] = dp[i-1]%mod;
                if(Integer.parseInt(str.substring(i-1, i+1)) <= 26){
                    if(i>=2)
                      dp[i] += dp[i-2]%mod;
                    else
                      dp[i] += 1;
                }
            }
        }
        return dp[str.length()-1]%mod;
    }
}