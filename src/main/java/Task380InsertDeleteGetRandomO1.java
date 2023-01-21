import java.util.*;

public class Task380InsertDeleteGetRandomO1 {
    class RandomizedSet {
        Map<Integer, Integer> map;
        List<Integer> list;
        Random random;

        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }

            map.put(val, list.size());
            list.add(val);

            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)){
                return false;
            }

            int index = map.remove(val);

            if (index < list.size() - 1) {
                int last = list.get(list.size() - 1);
                map.put(last, index);
                list.set(index, last);
            }

            list.remove(list.size() - 1);

            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}
