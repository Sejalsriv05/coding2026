// Last updated: 05/07/2026, 22:22:35
class Solution {
    public int firstUniqChar(String s) {
         int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
        
       

        }
        
        
    }
        