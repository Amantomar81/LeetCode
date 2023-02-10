//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    
    private int[] calcMem(String str)
    {
        int mem[] = new int[26];
        
        for(char ch : str.toCharArray())
        {
            mem[ch-'a']++;
        }
        
        return mem;
    }
    
    private int maxInstance(int mem[], int str_mem[])
    {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<26; i++)
        {
            if(str_mem[i]>0)
            {
                ans = Math.min(ans, mem[i]/str_mem[i]);
            }
        }
        
        return ans;
    }
    
    public int maxInstance(String s) {
        
        int mem[] = calcMem(s);
        int str_mem[] = calcMem("balloon");
        
        return maxInstance(mem, str_mem);
        
    }
}