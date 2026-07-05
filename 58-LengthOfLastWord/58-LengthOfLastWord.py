# Last updated: 05/07/2026, 22:22:41
class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.rstrip()  # Remove trailing spaces
        length = 0

        # Start from the end of the string and move backwards
        for i in range(len(s) - 1, -1, -1):
            if s[i] == ' ':
                break
            length += 1
        
        return length
        