public class Task704BinarySearch {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int lowerBound = 0;
        int upperBound = nums.length - 1;
        int middle = (lowerBound + upperBound) / 2;

        while (lowerBound < upperBound) {
            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] < target) {
                lowerBound = middle + 1;
            }

            if (nums[middle] > target) {
                upperBound = middle - 1;
            }

            middle = (lowerBound + upperBound) / 2;
        }


        return target;
    }
}
