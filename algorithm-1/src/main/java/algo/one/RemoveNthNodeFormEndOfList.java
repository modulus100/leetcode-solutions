package algo.one;

public class RemoveNthNodeFormEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        var ptrFirst = head;
        var ptrSecond = head;
        var numberOfNodes = 1;

        while (ptrFirst.next != null) {
            ptrFirst = ptrFirst.next;
            numberOfNodes++;
        }

        if (numberOfNodes == 1) {
            return null;
        }

        if (numberOfNodes == n) {
            return head.next;
        }

        final var limit = numberOfNodes - n;
        var cnt = 1;

        while (cnt != limit) {
            ptrSecond = ptrSecond.next;
            cnt++;
        }

        ptrSecond.next = ptrSecond.next.next;
        return head;
    }
}
