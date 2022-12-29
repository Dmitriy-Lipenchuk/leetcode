import java.util.HashMap;
import java.util.Map;

public class Task169MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums) {
            map.merge(num, 1, (x,y) -> x + y);
        }

        for (Map.Entry<Integer, Integer> ent : map.entrySet()) {
            if (ent.getValue() > nums.length/2) {
                return ent.getKey();
            }
        }

        return -1;
    }
}
