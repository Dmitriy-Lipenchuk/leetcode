// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/
public class Task1493LongestSubarrayAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int previous = 0;
        int current = 0;
        int zero_counter = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                zero_counter = 0;
            } else {
                zero_counter++;
            }

            if (zero_counter > 1) {
                current = 0;
                previous = 0;
            }

            if (zero_counter == 1) {
                previous = current;
                current = 0;
            }

            max = Math.max(max, current + previous);
        }

        if (max == nums.length) {
            return max - 1;
        }

        return max;
    }
}
