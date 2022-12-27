import java.util.HashSet;

public class Task771JewelsAndStones {
    public int numJewelsInStones(String j, String s) {
        HashSet<Character> jewels = new HashSet<>();
        int counter = 0;

        for (int i = 0; i < j.length(); i++) {
            jewels.add(j.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (jewels.contains(s.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }
}
