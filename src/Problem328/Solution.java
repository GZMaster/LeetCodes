package Problem328;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head, even = head.next;
        helper(odd, even);
        while (odd != null && odd.next != null) {
            odd = odd.next;
        }
        odd.next = even;
        return head;
    }

    private void helper(ListNode odd, ListNode even) {
        if (odd == null || even == null) {
            return;
        }
        odd.next = even.next;
        if (even.next != null) {
            even.next = even.next.next;
        }
        helper(odd.next, even.next);
    }
}
