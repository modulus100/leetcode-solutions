package algo.one;

public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        var node = head;
        var nodeNumber = 1;

        while (node.next != null) {
            node = node.next;
            nodeNumber++;
        }

        var mid = (nodeNumber / 2) + 1;
        var cnt = 1;
        node = head;

        while (cnt != mid) {
            node = node.next;
            cnt++;
        }

        return node;
    }
}
