// Last updated: 06/07/2026, 18:39:53
1import java.util.Arrays;
2
3class Solution {
4    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
5
6        int[] merged = new int[nums1.length + nums2.length];
7
8        // Copy nums1
9        for (int i = 0; i < nums1.length; i++) {
10            merged[i] = nums1[i];
11        }
12
13        // Copy nums2
14        for (int i = 0; i < nums2.length; i++) {
15            merged[nums1.length + i] = nums2[i];
16        }
17
18        Arrays.sort(merged);
19
20        int n = merged.length;
21
22        if (n % 2 == 1) {
23            return merged[n / 2];
24        } else {
25            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
26        }
27        
28    }
29}