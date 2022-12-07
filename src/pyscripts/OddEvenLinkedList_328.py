# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        oddCount = head
        evenCount = head.next

        if head == None:
            return None

        output = head

        while (oddCount.next != None and evenCount.next != None):
            oddCount.next = oddCount.next.next
            evenCount.next = evenCount.next.next

        output = oddCount
        output.next = evenCount

        return output
