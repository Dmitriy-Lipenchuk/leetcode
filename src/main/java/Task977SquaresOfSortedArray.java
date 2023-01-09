public class Task977SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left_pointer = 0;
        int right_pointer = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int left_num = Math.abs(nums[left_pointer]);
            int right_num = Math.abs(nums[right_pointer]);

            if (left_num > right_num) {
                result[i] = left_num * left_num;
                left_pointer++;
            } else {
                result[i] = right_num * right_num;
                right_pointer--;
            }
        }

        return result;
    }
}
