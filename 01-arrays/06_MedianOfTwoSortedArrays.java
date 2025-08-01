// Problem: Find Meadian Sorted Arrays
// Author: Faizan (faizansaifigns)

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merged = new ArrayList<>();
        
        for (int num : nums1) {
            merged.add(num);
        }
        for (int num : nums2) {
            merged.add(num);
        }

        Collections.sort(merged); 

        int t = merged.size();
        if (t % 2 != 0) {
            return merged.get(t / 2);
        } else {
            int mid1 = merged.get(t / 2 - 1);
            int mid2 = merged.get(t / 2);
            return (mid1 + mid2) / 2.0;
        }
    }
}
