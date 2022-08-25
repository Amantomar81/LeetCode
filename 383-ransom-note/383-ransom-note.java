class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    
        int arr[] = new int[26];
        for(char x:magazine.toCharArray()){
            arr[x-'a']++;
        }
        for(char y:ransomNote.toCharArray()){
            if(arr[y-'a']==0){
                return false;
            }
             else {
                arr[y - 'a']--;
            }
        }
        return true;
    }
}