// Last updated: 09/07/2026, 22:11:29
1class Solution {
2
3    public boolean isPalindrome(String s) {
4        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
5        return check(s, 0);
6    }
7
8    public boolean check(String s, int i) {
9        if (i >= s.length() / 2) {
10            return true;
11        }
12
13        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
14            return false;
15        }
16
17        return check(s, i + 1);
18    }
19}