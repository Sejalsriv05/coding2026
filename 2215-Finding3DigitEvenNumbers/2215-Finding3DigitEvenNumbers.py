# Last updated: 05/07/2026, 22:22:30
from itertools import permutations

class Solution(object):
    def findEvenNumbers(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        unique_numbers = set()
        
        for perm in permutations(digits, 3):
            if perm[0] == 0:
                continue  # Skip numbers with leading zero
            if perm[2] % 2 != 0:
                continue  # Skip if the number is not even
            num = perm[0] * 100 + perm[1] * 10 + perm[2]
            unique_numbers.add(num)
        
        return sorted(unique_numbers)
