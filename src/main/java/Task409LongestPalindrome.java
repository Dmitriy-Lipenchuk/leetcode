import java.util.HashMap;

public class Task409LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaa"));
    }

    public static int longestPalindrome(String s) {
        int size = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i),1,(x,y) -> x + y);
        }

        for(Integer value : map.values()) {
            size += (value/2) * 2;
            if (size % 2 == 0 && value%2 == 1) {
                size++;
            }
        }

        return size;
    }
}
