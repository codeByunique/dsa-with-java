
// Problem: Reverse an array
// Author: Ataubl (codeByunique)

class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
