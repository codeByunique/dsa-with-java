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

---

### 🔀 Merge Two Sorted Linked Lists

**Problem:** Merge two sorted linked lists into one sorted linked list.

**Example:**  
Input: `1 → 3 → 5`, `2 → 4 → 6`  
Output: `1 → 2 → 3 → 4 → 5 → 6`

**Approach:**  
Use two pointers to compare elements from both lists and build a new list.

**Time Complexity:** O(n + m)  
**Space Complexity:** O(1) (excluding output list nodes)

---

### 🔸 Middle of Linked List

**Problem:** Return the middle node of a linked list.  
If two middle nodes exist, return the second one.

**Example:**  
Input: `1 → 2 → 3 → 4 → 5`  
Output: `3`

**Approach:**  
Use slow and fast pointers. Move `slow` by 1 step and `fast` by 2 steps.  
When `fast` reaches the end, `slow` is at the middle.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 🔻 Remove Nth Node from End of Linked List

**Problem:** Delete the nth node from the end of a linked list and return the new head.

**Example:**  
Input: `1 → 2 → 3 → 4 → 5`, n = 2  
Output: `1 → 2 → 3 → 5`

**Approach:**  
Use two-pointer technique with a dummy node.  
Move the first pointer `n+1` steps ahead, then move both until the first reaches null.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
