//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]matrix, int R, int C){
        //code here
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=0;
        char dir='r';
        while(i>=0 && i<n && j>=0 && j<m){
            
            if(matrix[i][j]==0){
                if(dir=='r') j++;
                if(dir=='u') i--;
                if(dir=='d') i++;
                if(dir=='l') j--;
            }
            
            else{
                
                matrix[i][j]=0;
                if(dir=='r'){
                    i++;
                    dir='d';
                }
                else if(dir=='l'){
                    i--;
                    dir='u';
                }
                else if(dir=='d'){
                    j--;
                    dir='l';
                }
                else{
                    j++;
                    dir='r';
                }
            }
        }
        int ans[]=new int [2];
        if(dir=='r') j--;
        if(dir=='l') j++;
        if(dir=='u') i++;
        if(dir=='d') i--;
        
        ans[0]=i;
        ans[1]=j;
        
          return ans;
    }
}