// Problem: Subarrays with Given Sum
// Author: Ataubl (codeByunique)

import java.util.HashMap;

class SubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int targetSum = 5;

        int count = countSubarraysWithSum(arr, targetSum);
        System.out.println("Number of subarrays with sum " + targetSum + " = " + count);
    }

    public static int countSubarraysWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // for subarrays starting from index 0

        int count = 0;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;

            if (prefixSumMap.containsKey(currentSum - target)) {
                count += prefixSumMap.get(currentSum - target);
            }

            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
