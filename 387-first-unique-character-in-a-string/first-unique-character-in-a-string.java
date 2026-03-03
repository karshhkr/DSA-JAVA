
class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];   // frequency array for a-z

        char[] chars = s.toCharArray();   // convert string to char array

        // Step 1: Count frequency
        for (char c : chars) {
            freq[c - 'a']++;   // map 'a' to index 0, 'b' to 1, etc.
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }

        return -1;  // if no unique character found
    }
}