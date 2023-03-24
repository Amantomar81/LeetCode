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
            String ans = ob.removeReverse(S); 
            System.out.println(ans);
        }
    } 
} 

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    String removeReverse(String S) 
    { 
        // code here
         HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(S);
        
        for(int i=0; i< S.length(); i++) 
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0)+1);
        int flag = 0;
        int i=0, j=sb.length()-1;
        while(i<j){
            if(flag == 0){
                if(map.get(sb.charAt(i)) > 1){
                    if(map.get(sb.charAt(i)) == 1) map.remove(sb.charAt(i));
                    else map.put(sb.charAt(i), map.get(sb.charAt(i))-1);
                    sb.deleteCharAt(i);
                    flag = 1 - flag;
                    j=sb.length()-1;
                }else i++;
                
            }else {
                if(map.get(sb.charAt(j)) > 1){
                    if(map.get(sb.charAt(j)) == 1) map.remove(sb.charAt(j));
                    else map.put(sb.charAt(j), map.get(sb.charAt(j))-1);
                    sb.deleteCharAt(j);
                    flag = 1 - flag;
                }else {
                    j--;
                }
                
            }
        }
        if(flag == 1) sb.reverse(); 
        return sb.toString();

    }
} 

//{ Driver Code Starts.

// } Driver Code Ends