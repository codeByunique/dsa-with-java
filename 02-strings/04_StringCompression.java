// Problem: String Compression
// Author: Ataul (codeByunique)

class StringCompression {
    public static void main(String[] args) {
        char[] input = {'a','a','b','b','c','c','c'};
        StringCompression obj = new StringCompression();
        int length = obj.compress(input);

        System.out.print("Compressed: ");
        for (int i = 0; i < length; i++) {
            System.out.print(input[i]);
        }
        System.out.println("\nNew Length: " + length);
    }

    public int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
