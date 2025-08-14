// Problem: Implement Queue using Stack
// Author: Atabul (codeByunique)

import java.util.Stack;

class ImplementQueueUsingStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public ImplementQueueUsingStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        peek(); // Ensure s2 has the current front
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek()); // 1
        System.out.println(queue.pop());  // 1
        System.out.println(queue.empty()); // false
    }
}
