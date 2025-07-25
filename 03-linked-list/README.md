# 📂 03 Linked List

This section includes problems like:
- Reverse a Linked List
- Detect Loop
- Merge Two Sorted Lists
- Middle of Linked List
- Remove Nth Node from End

---

### 🔁 Reverse a Linked List

**Problem:** Reverse a singly linked list and return the new head.

**Example:**  
Input: `1 → 2 → 3 → 4 → 5`  
Output: `5 → 4 → 3 → 2 → 1`

**Approach:**  
Use 3 pointers: `prev`, `current`, `next`. Traverse and reverse pointers one by one.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 🔁 Detect Loop in Linked List

**Problem:** Check if a cycle (loop) exists in the linked list.

**Example:**  
1 → 2 → 3 → 4 → 5 → back to 3  
Output: true

**Approach:**  
Use Floyd’s Cycle Detection Algorithm (slow and fast pointers). If they meet, a loop exists.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
