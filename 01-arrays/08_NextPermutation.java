// Problem: Next Permutation
// Author: faizan (faizansaifigns)


class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;

        // Step 1: Find pivot: first i from right where nums[i] < nums[i+1]
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse whole array and return
        if (pivot == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find the next greater element to pivot and swap
        for (int i = nums.length - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the part after pivot
        reverse(nums, pivot + 1, nums.length - 1);
    }

    // Helper to swap two elements
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper to reverse part of array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
