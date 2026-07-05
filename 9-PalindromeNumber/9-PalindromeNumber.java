// Last updated: 05/07/2026, 22:22:42
class Solution {
    public boolean isPalindrome(int x) {
        int palindrom=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;

        }
        return palindrom==rev;
        
    }
}