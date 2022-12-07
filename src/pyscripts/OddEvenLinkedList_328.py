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
        
        result = ListNode(head.val)
        result_tail = ListNode(result.val)

        while (oddCount != None and oddCount.next != None):
            odd = oddCount.next.next.val
            oddCount = oddCount.next.next
            
            result_tail.next = ListNode(odd)
            result_tail = result_tail.next
            
            

        return result
    
    
input = ListNode(1)
input.next = ListNode(2)
input.next.next = ListNode(3)
input.next.next.next = ListNode(4)
input.next.next.next.next = ListNode(5)

if __name__ == '__main__':
    s = Solution()
    print(s.oddEvenList(input))
