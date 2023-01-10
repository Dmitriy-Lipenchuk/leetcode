import java.util.ArrayList;


public class Task234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int firstPointer = 0;
        int lastPointer = list.size() - 1;

        while (firstPointer < lastPointer) {
            if (list.get(firstPointer++) != list.get(lastPointer--)) {
                return false;
            }
        }

        return true;
    }
}
