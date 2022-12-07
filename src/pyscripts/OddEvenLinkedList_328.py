# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        oddCount = head
        evenCount = head
        evenCount = evenCount.next
        
        if head == None:
            return None
        
        oddresult = ListNode(head.val)
        evenresult = ListNode(head.next.val)
        
        result_tail = oddresult

        while (oddCount.next != None and evenCount.next.next != None):
            odd = oddCount.next.next.val
            oddCount = oddCount.next.next
            
            result_tail.next = ListNode(odd)
            result_tail = result_tail.next
            
        result_tail = evenresult
        
        while (evenCount.next != None and evenCount.next.next != None):
            even = evenCount.next.next.val
            evenCount = evenCount.next.next
            
            result_tail.next = ListNode(even)
            result_tail = result_tail.next
            
        result = ListNode(oddresult)
        result.next = ListNode(evenresult)

        return result
    
    
input = ListNode(1)
input.next = ListNode(2)
input.next.next = ListNode(3)
input.next.next.next = ListNode(4)
input.next.next.next.next = ListNode(5)

if __name__ == '__main__':
    s = Solution()
    print(s.oddEvenList(input))
