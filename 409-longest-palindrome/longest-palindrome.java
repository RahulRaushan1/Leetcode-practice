class Solution {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int count = 0;
        boolean oddFound = false;

        for (int f : freq) {

            count += (f / 2) * 2;

            if (f % 2 == 1) {
                oddFound = true;
            }
        }

        if (oddFound) {
            count++;
        }

        return count;
    }
}