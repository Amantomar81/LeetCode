//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
      StringBuilder s = new StringBuilder(str);
      s.reverse();
      String res = s.toString();
      return res;
       
       
       
    //   char arr[] = str.toCharArray();
    //   int n = str.length();
       
    //   ArrayList<Character> list = new ArrayList<>();
    //   for(int i=0;i<n;i++){
    //       list.add(arr[i]);
    //   }
    //   Collections.reverse(list);
       
    //   String l = list.toString();
       
    //   return l;
    }
}