// Problem: Pattern Searching (Naive Approach)
// Author: Ataul (codeByunique)

class PatternSearching {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";

        patternSearch(text, pattern);
    }

    // Naive Pattern Search
    public static void patternSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // Full match found
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }
}
