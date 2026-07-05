# Last updated: 05/07/2026, 22:22:25
class Solution(object):
    def lengthAfterTransformations(self, s, t):
        """
        :type s: str
        :type t: int
        :rtype: int
        """
        MOD = 10**9 + 7
        count = [0] * 26  # count[i] represents count of chr(i + ord('a'))

        # Initialize character frequency
        for ch in s:
            count[ord(ch) - ord('a')] += 1

        for _ in range(t):
            next_count = [0] * 26
            for i in range(26):
                if i < 25:
                    next_count[i + 1] = (next_count[i + 1] + count[i]) % MOD
                else:
                    # 'z' becomes 'a' and 'b'
                    next_count[0] = (next_count[0] + count[25]) % MOD
                    next_count[1] = (next_count[1] + count[25]) % MOD
            count = next_count

        return sum(count) % MOD
