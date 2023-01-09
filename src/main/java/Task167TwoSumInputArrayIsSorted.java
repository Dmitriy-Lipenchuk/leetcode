public class Task167TwoSumInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (numbers[leftPointer] + numbers[rightPointer] != target) {
            if (numbers[leftPointer] + numbers[rightPointer] > target) {
                rightPointer--;
            } else {
                leftPointer++;
            }
        }

        return new int[]{leftPointer + 1, rightPointer + 1};
    }
}
