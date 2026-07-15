// Last updated: 15/07/2026, 23:33:03
1class Solution {
2    public boolean check(int[] nums) {
3        int count=0;
4        int n=nums.length;
5
6        for(int i=0;i<n;i++){
7            if(nums[i]>nums[(i+1)%n]){
8                count++;
9            }
10        }
11        return count<=1;
12        
13    }
14}