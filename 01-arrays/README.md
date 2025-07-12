# 📂 01 Arrays

This section includes problems like:
- Reverse the array
- Find Maximum/Minimum element
- Kadane's Algorithm
- Two Sum
- Subarrays with given sum

---

### 🔁 Reverse the Array

**Problem:** Reverse the elements of an array in-place.

**Input:** [1, 2, 3, 4]  
**Output:** [4, 3, 2, 1]

**Approach:**  
Use two-pointer technique. Swap the first and last elements and move inward.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 🔼 Find Maximum and Minimum Element

**Problem:** Find the largest and smallest element in an array.

**Input:** [3, 9, 1, 7, 4, -2, 10]  
**Output:** Max = 10, Min = -2

**Approach:**  
Loop through the array and update `max` and `min` while traversing.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 📈 Kadane's Algorithm (Maximum Subarray Sum)

**Problem:** Find the contiguous subarray (with at least one number) that has the largest sum.

**Input:** [-2, 1, -3, 4, -1, 2, 1, -5, 4]  
**Output:** 6  
**Explanation:** Subarray = [4, -1, 2, 1]

**Approach:**  
Use Kadane’s Algorithm:  
At each index, decide whether to continue with the current subarray or start a new one.  
Track the global maximum sum found so far.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---
