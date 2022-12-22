import java.util.HashMap;

public class Task242ValidAnagram {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> letters = new HashMap<>();
        HashMap<Character, Integer> tLetters = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            letters.merge(s.charAt(i), 1, (x,y) -> x + y);
            tLetters.merge(t.charAt(i), 1, (x,y) -> x + y);
        }

        for(int i = 0; i < s.length(); i++) {
            if (letters.get(s.charAt(i)) != tLetters.get(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
