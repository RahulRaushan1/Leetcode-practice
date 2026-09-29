import java.util.*;

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        Set<String> set = new HashSet<>();

        // Store all prefixes of arr1
        for (int num : arr1) {

            String str = String.valueOf(num);

            for (int i = 1; i <= str.length(); i++) {
                set.add(str.substring(0, i));
            }
        }

        int max = 0;

        // Check prefixes of arr2
        for (int num : arr2) {

            String str = String.valueOf(num);

            for (int i = 1; i <= str.length(); i++) {

                String prefix = str.substring(0, i);

                if (set.contains(prefix)) {
                    max = Math.max(max, i);
                }
            }
        }

        return max;
    }
}