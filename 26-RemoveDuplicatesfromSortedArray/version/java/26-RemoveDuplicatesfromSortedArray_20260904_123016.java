// Last updated: 04/09/2026, 12:30:16
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        int j=i+1;
5        int k=1;
6        while(j<nums.length){
7            if(nums[j]==nums[j-1]){
8                j++;
9                continue;
10            }
11            nums[i+1]=nums[j];
12            i++;
13            j++;
14            k++;
15
16
17        }
18        return k;
19        
20    }
21}