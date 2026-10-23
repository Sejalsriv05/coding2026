// Last updated: 23/10/2026, 20:35:49
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i=0;
4        int j=numbers.length-1;
5        int sum=0;
6       while(i<j){
7         sum=numbers[i]+numbers[j];
8        if(sum==target){
9            return new int[]{i+1,j+1};
10
11        }
12        else if(sum<target){
13            i++;
14        }
15        else if(sum>target){
16            j--;
17        }
18
19       }
20       return new int[]{};
21        
22
23
24        
25    }
26}