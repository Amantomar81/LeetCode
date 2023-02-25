//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            String T = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.checkCompressed(S,T));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkCompressed(String S, String T) {
        int f = 0;
        int s= 0;
        int n1 = S.length();
        int n2 = T.length();
        
        while(f < n1 && s < n2){
            char sc = S.charAt(f);
            char t = T.charAt(s);
            
            if(sc == t){
                f++;
                s++;
                continue;
            }
            
            if(!Character.isDigit(t) && sc != t ){
                return 0;
            }
            
            if(t - '0' == 0){
                s++; 
                continue;
            }
            
            if(Character.isDigit(t)){
                int ahead = 0;
                
                while(s < n2 && Character.isDigit(T.charAt(s) ) ){
                    
                    int d = Character.getNumericValue(T.charAt(s));
                    
                    ahead = ahead * 10 + d;
                    s++;
                }
                f += ahead;
            }
            
        }
        
        if(s == n2  && f == n1 ){
            return 1;
        }
        else{
            return 0;
        }
    }
}