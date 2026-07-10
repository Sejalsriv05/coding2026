// Last updated: 10/07/2026, 23:19:53
1class Solution {
2    public int fib(int n) {
3        if (n <= 1) {
4            return n;
5        }
6
7        return fib(n - 1) + fib(n - 2);
8    }
9}