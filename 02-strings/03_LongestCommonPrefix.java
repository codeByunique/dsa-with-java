// Problem: Longest Common Prefix
// Author: Ataubl (codeByunique)

class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // While current string doesn't start with prefix
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // reduce prefix
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
