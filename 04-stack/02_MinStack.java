// Problem: Min Stack
// Author: Ataul (codeByunique)

import java.util.Stack;

class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int removed = mainStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println("Min: " + stack.getMin()); // -3
        stack.pop();
        System.out.println("Top: " + stack.top());    // 0
        System.out.println("Min: " + stack.getMin()); // -2
    }
}
