package Problem328;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode input = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println(s.oddEvenList(input));
    }
}
