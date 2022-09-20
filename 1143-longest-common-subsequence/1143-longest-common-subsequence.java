class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        char[] ch = new char[text1.length()];
        char[] ch1 = new char[text2.length()];
        
        for(int i=0;i<text1.length();i++){
            ch[i] = text1.charAt(i);
        }
        for(int i=0;i<text2.length();i++){
            ch1[i] = text2.charAt(i);
        }
        int max =0;
        int temp[][] = new int[ch.length+1][ch1.length+1];
        for(int i=1;i<temp.length;i++){
            for(int j=1;j<temp[i].length;j++){
                if(ch[i-1] == ch1[j-1]){
                    temp[i][j] = temp[i-1][j-1] + 1; 
                }
                else{
                    temp[i][j] = Math.max(temp[i][j-1] , temp[i-1][j]);
                }
                if(temp[i][j]>max){
                    max = temp[i][j];
                }
            }
        }
        return max;
    }
}
// if(sr1[i-1] == str2[j-1]){
//     temp[i][j] = temp[i-1][j-1] +1;
// }
// else{
//     temp[i][j]=Math.max(temp[i][j-1],temp[i-1][j]);
// }