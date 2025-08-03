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

### ✅ Next Greater Element

**Problem:**  
For each element in an array, find the next greater element to its right.  
If no such element exists, return -1.

**Example:**  
Input: [4, 5, 2, 25] → Output: [5, 25, 25, -1]  
Input: [13, 7, 6, 12] → Output: [-1, 12, 12, -1]

**Approach:**  
Traverse from right to left and use a stack to maintain potential next greater elements.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

---

### ✅ Evaluate Reverse Polish Notation

**Problem:**  
Evaluate a postfix (Reverse Polish Notation) expression using stack.

**Example:**  
Input: ["2", "1", "+", "3", "*"]  
Output: 9  
Explanation: (2 + 1) * 3 = 9

**Approach:**  
Use a stack to push numbers.  
On encountering an operator, pop two numbers, apply the operation, and push the result back.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)
