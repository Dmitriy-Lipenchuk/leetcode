import java.util.Arrays;

public class Merge2SortedLists {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 5, 6};
        int[] b = new int[]{3, 4, 5};

        System.out.println(Arrays.toString(merge(a, b)));
    }

    public static int[] merge(int[] first, int[] second) {
        int firstPointer = 0;
        int secondPointer = 0;
        int[] resultArray = new int[first.length + second.length];

        for (int i = 0; i < resultArray.length; i++) {
            if (secondPointer == second.length || (firstPointer < first.length && first[firstPointer] < second[secondPointer])) {
                resultArray[i] = first[firstPointer++];
            } else {
                resultArray[i] = second[secondPointer++];
            }
        }

        return resultArray;
    }
}
