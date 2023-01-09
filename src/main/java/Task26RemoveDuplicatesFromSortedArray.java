public class Task26RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        int previous = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previous) {
                nums[pointer++] = nums[i];
                previous = nums[i];
            }
        }

        return pointer;
    }
}
