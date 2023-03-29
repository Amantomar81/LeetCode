//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
//User function Template for Java
class Solution 
{ 
    int countSubstring(String S) 
    { 
        // code here
        char [] ch = S.toCharArray();
        int n = ch.length;
        
        int count = 0;
        
        int lc = 0;
        int uc = 0;
        
        for(int i = 0; i<n-1 ; i++)
        {
            if( Character.isUpperCase(ch[i]) )
            {
                uc =1;
                lc=0;
            }
            else
            {
                lc =1;
                uc=0;
            }
            
            for(int j = i+1 ; j<n ; j++)
            {
                if( Character.isUpperCase(ch[j]) )
                {
                    uc++;
                }
                else
                {
                    lc++;
                }
                
                if(uc==lc)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}