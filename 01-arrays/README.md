# 📂 01 Arrays

This section includes problems like:
- Reverse the array
- Find Maximum/Minimum element
- Kadane's Algorithm
- Two Sum
- Subarrays with given sum
- Median of Two Sorted Arrays
- Find Lucky Integer
- Next Permutation

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

### ➕ Two Sum

**Problem:**  
Given an array of integers and a target sum, return the indices of the two numbers such that they add up to the target.

**Input:** [2, 7, 11, 15], target = 9  
**Output:** Indices = [0, 1]  
**Explanation:** 2 + 7 = 9

**Approach:**  
Use a HashMap to store the difference (target - current element) and its index.  
If the current element exists in the map, return the stored index and current index.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### 🧮 Subarrays with Given Sum

**Problem:**  
Given an array of integers and a target sum, count the number of continuous subarrays whose sum equals the target.

**Input:** [1, 2, 3, 2, 1], target = 5  
**Output:** 2  
**Explanation:** Subarrays = [2,3] and [3,2]

**Approach:**  
Use a prefix sum + hashmap to count how often a needed sum occurred before the current index.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### ⚖️ Median of Two Sorted Arrays

**Problem:**  
Given two sorted arrays, find the median of the combined sorted array.

**Input:** [1, 2], [3, 4]  
**Output:** 2.5

**Approach:**  
- Merge both arrays into one  
- Sort the merged array  
- If total size is odd, return middle  
- If even, return average of two middle elements

**Time Complexity:** O((m+n) log(m+n))  
**Space Complexity:** O(m+n)

**Contributor:** Faizan (faizansaifigns)

---

### 🍀 Find Lucky Integer

**Problem:**  
Find the largest integer in the array such that its **frequency is equal to its value**. If no such integer exists, return -1.

**Input:** [2, 2, 3, 4]  
**Output:** 2  
**Explanation:** 2 occurs twice, and value is also 2 → Lucky!

**Approach:**  
- Use a `HashMap` to count frequency of each number  
- Traverse the map and check if any number's frequency equals its value  
- Track the maximum such lucky number

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

**Contributor:** Faizan (faizansaifigns)

---

### 🔁 Next Permutation

**Problem:**  
Find the **next lexicographically greater permutation** of the given array. If no such permutation exists, rearrange to the lowest possible order (i.e., sorted in ascending).

**Input:** [1, 2, 3]  
**Output:** [1, 3, 2]  
**Input:** [3, 2, 1]  
**Output:** [1, 2, 3]

**Approach:**  
1. Traverse from right to find the **pivot** (first element from right such that `nums[i] < nums[i+1]`)  
2. If not found, reverse entire array  
3. Else, find **next greater element** to the right of pivot, and swap  
4. Reverse the suffix (right part of pivot)

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

**Contributor:** Faizan (faizansaifigns)

---

