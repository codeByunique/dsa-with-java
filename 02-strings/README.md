# 📂 02 Strings

This section includes problems like:
- Check for Palindrome
- Anagram check
- Longest Common Prefix
- String Compression
- Pattern Searching

---

### 🔁 Check for Palindrome

**Problem:**  
Check whether a given string is a palindrome or not.

**Input:** "madam"  
**Output:** true  
**Explanation:** Reversed string is also "madam"

**Approach:**  
Use two pointers (start and end), and check if characters match while moving inward.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 🔤 Anagram Check

**Problem:**  
Check whether two strings are anagrams of each other.

**Input:** "listen", "silent"  
**Output:** true  
**Explanation:** Both have same letters in different order

**Approach:**  
- Clean the strings (remove spaces and convert to lowercase)  
- Sort both strings  
- Compare the sorted versions

**Time Complexity:** O(n log n)  
**Space Complexity:** O(n)

---

### 🔗 Longest Common Prefix

**Problem:**  
Find the longest common prefix string among an array of strings.

**Input:** ["flower", "flow", "flight"]  
**Output:** "fl"  
**Explanation:** All strings start with "fl"

**Approach:**  
- Assume first string is the prefix  
- Compare it with each string in array  
- Shorten prefix if mismatch found

**Time Complexity:** O(n * m) (n = number of strings, m = average length)  
**Space Complexity:** O(1)

### 🧲 String Compression

**Problem:** Compress a character array in-place such that repeated characters are replaced by the character followed by the count.

**Example:**  
Input: `['a','a','b','b','c','c','c']`  
Output: `['a','2','b','2','c','3']`  
Returned length: `6`

**Approach:**  
Use two pointers — one for reading characters and another for writing compressed result. Count consecutive characters and insert count only when more than one.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)
