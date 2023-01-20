import java.util.Iterator;

public class FibonaciInterator {
    public static void main(String[] args) {
        Iterator<Long> fibonaci = new Iterator<>() {
            long previous = 0;
            long current = 1;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Long next() {
                current = previous + current;
                previous = current - previous;

                return previous;
            }
        };
    }
}
