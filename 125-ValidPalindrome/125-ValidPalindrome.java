// Last updated: 05/07/2026, 22:22:37
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String store="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                store+=s.charAt(i);
            }

        }
        String reverse="";
        for(int i=store.length()-1;i>=0;i--){
            reverse+=store.charAt(i);

        }
        return reverse.equals(store);
        
    }
}