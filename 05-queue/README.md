# 📂 05 Queue

This section includes problems like:
- Implement Queue using Stack
- Circular Queue
- LRU Cache
- Sliding Window Maximum

---

### ✅ Implement Queue using Stack

**Problem:**  
Implement a FIFO queue using two stacks.

**Example:**  
Input:
push(1)
push(2)
peek() → 1
pop() → 1
empty() → false

**Approach:**  
- Use two stacks `s1` and `s2`.  
- Push elements to `s1`.  
- For `pop`/`peek`, transfer elements from `s1` to `s2` only when `s2` is empty.  
- This ensures amortized O(1) operations.

**Time Complexity:** O(1) amortized  
**Space Complexity:** O(n)