//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

//User function Template for Java

class Solution
{
	public static String removeBrackets(String s){
	    char[] sArr = s.toCharArray();
	    int n = sArr.length;
	    int ans[] = new int[n + 1];
	    Arrays.fill(ans, 1);
	    int[] lastOp = new int[n + 1];
	    int[] nextOp = new int[n + 1];
	    Stack<Integer> st = new Stack<>();
	    ArrayList<ArrayList<Integer>> sign = new ArrayList<>();
	    for(int it = 0 ; it < 256 ; it++) sign.add(new ArrayList<Integer>());
	    int[] oP = new int[256];
	    int[] vis = new int[n + 1];
	    Arrays.fill(vis, 1);
	    int i = 0;
		while(i < n){
		    if(sArr[i] == '(') {st.push(i); ++i;}
		    else if(sArr[i] == ')'){
		        int ind = st.pop();
		        int it = i + 1;
		        while(!st.isEmpty() && st.peek() == ind - 1 && sArr[it] == ')'){
		            vis[ind - 1] = 0;
		            vis[it] = 0;
		            st.pop();
		            ++it;
		            --ind;
		        }
		        i = it;
		    }
		    else ++i;
		}
		StringBuilder temp = new StringBuilder();
		for(i = 0 ; i < n ; i++) if(vis[i] > 0) temp.append(sArr[i]);
		s = temp.toString();
		sArr = s.toCharArray();
		n = sArr.length;
		int l = -1;
		for(i = 0 ; i < n ; i++){
		    lastOp[i] = l;
		    if("*/+-".contains(sArr[i] + "")) l = sArr[i];
		    if(sArr[i] == '(') l = -1;
		}
		l = -1;
		for(i = n - 1 ; i >= 0 ; i--){
		    nextOp[i] = l;
		    if("*/+-".contains(sArr[i] + "")) l = sArr[i];
		    if(sArr[i] == '(') l = -1;
		}
		for(i = 0 ; i < 256 ; i++) sign.get(i).add(-1);
		char[] operators = {'*', '/', '+', '-'};
		for(int p = 0 ; p < n ; p++){
		    for(char c : operators){
		        oP[c] = 0;
		        if(c == sArr[p]) sign.get(c).add(p);
		    }
		    if(sArr[p] == '(') st.push(p);
		    else if(sArr[p] == ')'){
		        i = st.pop();
		        int j = p;
		        int next = nextOp[j];
		        int last = lastOp[i];
		        for(char c : operators){
		            if(sign.get(c).size() > 0 && sign.get(c).get(sign.get(c).size() - 1) >= i){
		                if(sign.get(c).size() > 1) sign.get(c).remove(sign.get(c).size() - 1);
		                oP[c] = 1;
		            } 
		        }
		        int ok = 0;
		        if(oP['+'] == 0 && oP['*'] == 0 && oP['-'] == 0 && oP['/'] == 0) ok = 1;
		        if(last == '/') ok = 0;
		        if(last == -1 && next == -1) ok = 1;
		        else if((char)last != '+' && (oP['+'] == 1 || oP['-'] == 1)) ok = 0;
		        else if(((char)next == '/' || (char)next == '*') && (oP['+'] == 1 || oP['-'] == 1)) ok = 0;
		        else if((char)last == '*' && oP['+'] == 0 && oP['-'] == 0) ok = 1;
		        else if((char)next == '*' && oP['+'] == 0 && oP['-'] == 0) ok = 1;
		        else{
		            if((last == -1 || last == '+' || last == '-') && (next == -1 || next == '+' || next == '-')) ok = 1;
		        }
	            if(ok == 1){
	                ans[i] = 0;
	                ans[j] = 0 ;
	            }
		    }
		}
		StringBuilder res = new StringBuilder();
		for(i = 0 ; i < n ; i++) if(ans[i] > 0) res .append((char)(sArr[i]));
		return res.toString();
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String Exp = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.removeBrackets(Exp));
        }
        
    }
}
// } Driver Code Ends