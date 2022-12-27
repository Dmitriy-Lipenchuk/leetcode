import java.util.ArrayList;
import java.util.HashMap;

public class Task350IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> intersec = new ArrayList<>();

        for (int num : nums1) {
            map.merge(num, 1, (prev, curr) -> prev + curr);
        }

        for (int num : nums2) {
            Integer val = map.get(num);
            if (val != null && val > 0) {
                intersec.add(num);
                map.merge(num, -1, (prev, curr) -> prev + curr);
            }
        }

        return intersec.stream().mapToInt(x -> x).toArray();
    }
}
