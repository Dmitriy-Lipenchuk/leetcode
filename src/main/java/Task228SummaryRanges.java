import java.util.ArrayList;
import java.util.List;

public class Task228SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        int left_pointer = 0;
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) {
            return ranges;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i + 1] - nums[i] != 1) {
                if (left_pointer == i) {
                    ranges.add(nums[left_pointer] + "");
                } else {
                    ranges.add(nums[left_pointer] + "->" + nums[i]);
                }
                left_pointer = i + 1;
            }
        }

        return ranges;
    }
}
