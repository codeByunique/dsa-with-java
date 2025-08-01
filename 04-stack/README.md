# 📂 04 Stack

This section includes problems like:
- Valid Parentheses
- Min Stack
- Next Greater Element
- Evaluate Reverse Polish Notation

---

### ✅ Valid Parentheses

**Problem:**  
Check if the input string of brackets is valid (correct order and type of opening/closing brackets).

**Example:**  
Input: `({[]})`  
Output: `true`

**Approach:**  
Use a stack to push opening brackets. For closing brackets, check if the top of the stack matches the correct opening bracket.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### ✅ Min Stack

**Problem:**  
Implement a stack that supports push, pop, top, and retrieving the minimum element in constant time.

**Operations:**  
- push(x)  
- pop()  
- top()  
- getMin()

**Example:**  
push(-2), push(0), push(-3), getMin() → -3  
pop(), top() → 0, getMin() → -2

**Approach:**  
Use an additional stack (`minStack`) to track the minimum at each level.

**Time Complexity:** O(1) per operation  
**Space Complexity:** O(n)

---

