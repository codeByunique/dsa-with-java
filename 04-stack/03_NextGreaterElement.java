// Problem: Next Greater Element
// Author: Ataul (codeByunique)

import java.util.Stack;

class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        printNextGreaterElements(arr);

        System.out.println();

        int[] arr2 = {13, 7, 6, 12};
        printNextGreaterElements(arr2);
    }

    public static void printNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Remove all elements smaller than or equal to current
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack is empty, no greater element
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element to stack
            stack.push(arr[i]);
        }

        // Print the result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
