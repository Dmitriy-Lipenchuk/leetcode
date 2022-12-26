import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class Task20ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> symbols = new HashMap<>();
        symbols.put(')','(');
        symbols.put(']','[');
        symbols.put('}','{');

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(!symbols.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();

                if(symbols.get(c) != top) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
