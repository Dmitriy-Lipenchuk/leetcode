import java.util.HashSet;

public class Task3LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left_pointer = 0;
        int right_pointer = 0;
        HashSet<Character> set = new HashSet<>();

        while (right_pointer < s.length()) {
            if (!set.contains(s.charAt(right_pointer))) {
                set.add(s.charAt(right_pointer++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(left_pointer++));
            }
        }

        return max;
    }
}
