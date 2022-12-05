public class MiddleLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode middleNode(ListNode head) {
        ListNode slowCount = head;
        ListNode fastCount = head;

        if (head == null) {
            return null;
        }

        while (fastCount != null && fastCount.next != null) {
            slowCount = slowCount.next;
            if (fastCount.next.next == null) {
                return slowCount;
            } else {
                fastCount = fastCount.next.next;
            }
        }

        return slowCount;
    }
}
