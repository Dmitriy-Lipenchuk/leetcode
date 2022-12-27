public class Task1446ConsecutiveCharacters {
    public int maxPower(String s) {
        if (s == null) {
            return 0;
        }

        char prevChar = s.charAt(0);
        int counter = 1;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prevChar) {
                counter++;
            } else {
                prevChar = s.charAt(i);
                max = Math.max(max, counter);
                counter = 1;
            }
        }

        max = Math.max(max, counter);

        return max;
    }
}
