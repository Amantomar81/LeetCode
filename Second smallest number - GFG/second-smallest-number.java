//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] inp=read.readLine().split(" ");
            int S=Integer.parseInt(inp[0]);
            int D=Integer.parseInt(inp[1]);

            Solution ob = new Solution();
            System.out.println(ob.secondSmallest(S,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String secondSmallest(int S, int D){
        int min=1,digit,counter=0,temp=0,a=S,digit2;
         StringBuilder str=new StringBuilder();
        if(9*D<S || D==1){
            return("-1");
        }
        else{
        for(int i=1;i<=D;i++){
            if(i==D){
                min=0;
            }
           if(a-9>=1) {
               digit=9;
           }
           else{
               digit=9-((9-a)+min);
           }
           digit2=digit;
        if(i>1 && counter!=2){
            if(digit<9){
                digit+=1;
                counter=2;
                str = str.replace(0, 1, Integer.toString(temp-1));
                
            }
        }
        temp=digit2;
        str=str.insert(0,digit);
        a-=digit2;
        }}
        if(counter!=2){
        return("-1");}
        else{
            return(str.toString());
        }
        
        
    }}