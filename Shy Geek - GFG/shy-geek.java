//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main{
    static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        

        while(t-->0){
            Shop shop = new Shop();

            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            long k = Long.parseLong(s[1]);

            s = br.readLine().trim().split(" ");

            for(String x: s){
                shop.addChocolate(Integer.parseInt(x));
            }
            
            ot.println(new Solution(shop).find(n, k));
        }
        ot.close();
    }
    
    
}
class Shop{
    private static List<Integer> chocoloates;
    private static int countOfCalls;
    Shop(){
        chocoloates = new ArrayList<>();
        countOfCalls = 0;
    }
    public static void addChocolate(int price){
        chocoloates.add(price);
    }

    public static int get(int i){
        countOfCalls++;
        if(countOfCalls > 50 || i >= chocoloates.size() || i < 0)
            return -1;
        return chocoloates.get(i);
    }
}
// } Driver Code Ends


//User function Template for Java

/*
Instructions - 

    1. 'shop' is object of class Shop.
    2. User 'shop.get(int i)' to enquire about the price
            of the i^th chocolate.
    3. Every chocolate in shop is arranged in increasing order
            i.e. shop.get(i) <= shop.get(i + 1) for all 0 <= i < n - 1
*/
//User function Template for Java

/*
Instructions - 

    1. 'shop' is object of class Shop.
    2. User 'shop.get(int i)' to enquire about the price
            of the i^th chocolate.
    3. Every chocolate in shop is arranged in increasing order
            i.e. shop.get(i) <= shop.get(i + 1) for all 0 <= i < n - 1
*/
class Solution{
    
public static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    long find(int n, long k){
        // Return the number of chocolates Geek had
        // enjoyed out of 'n' chocolates availabe in the
        // 'shop'.
        HashMap<Integer,Long> mm = new HashMap<>();
        long ans = 0;
        int low=0,high=n-1;
        while(true){
            int index = -1;
            long temp;
            while(low<=high){
                int mid = (low+high)/2;
                if(mm.get(mid)==null)
                temp = this.shop.get(mid);
                else temp=mm.get(mid);
                if(temp==-1)return ans;
                mm.put(mid,temp);
                if(temp<=k){
                    index=mid;
                    low=mid+1;
                }
                else high=mid-1;
            }
            if(index!=-1){
                if(mm.get(index)==null)
                temp = this.shop.get(index);
                else temp=mm.get(index);
                if(temp==-1)return ans;
                mm.put(index,temp);
                ans+=k/temp;
                k%=temp;
            }
            else break;
            low = 0;
            high = index-1;
        }
        return ans;
    }

}