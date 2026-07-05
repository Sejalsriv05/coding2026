# Last updated: 05/07/2026, 22:22:45
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False

        return str(x) == str(x)[::-1]    
        