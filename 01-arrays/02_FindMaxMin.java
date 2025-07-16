// Problem: Find Maximum and Minimum in an Array
// Author: Ataubl (codeByunique)

class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 7, 4, -2, 10};
        int n = arr.length;

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
