package Problem2;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode current = resultNode;

        int carry = 0;
        int v1 = 0;
        int v2 = 0;

        while (l1.next != null && l1.next != null || carry == 0) {
            if (l1 != null) {
                v1 = l1.val;
            } else {
                v2 = l2.val;
            }

            int val = v1 + v2 + carry;
            carry = Math.floorDiv(val, 10);
            val = val % 10;
            current.next = new ListNode(val);

            current = current.next;

            if (l1.next != null) {
                l1 = l1.next;
            }
            if (l2.next != null) {
                l2 = l2.next;
            }

        }

        return resultNode.next;
    }
}