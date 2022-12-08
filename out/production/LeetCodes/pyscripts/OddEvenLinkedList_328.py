# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        if head == None:
            return None
        
        if head.next == None:
            return head
        
        oddCount = head
        evenCount = head
        evenCount = evenCount.next
        
        oddarr = [oddCount.val] 
        evenarr = [evenCount.val]

        while (oddCount.next != None and oddCount.next.next != None):
            odd = oddCount.next.next.val
            oddCount = oddCount.next.next
            
            oddarr = oddarr + [odd]
            
        
        while (evenCount.next != None and evenCount.next.next != None):
            even = evenCount.next.next.val
            evenCount = evenCount.next.next
            
            evenarr = evenarr + [even]
            
        result = oddarr + evenarr
        
        output = ListNode(result[0])
        output_tail = output
        
        for i in range(1, len(result)):
            output_tail.next = ListNode(result[i])
            output_tail = output_tail.next

        return output
    
    
input = ListNode(1)
input.next = ListNode(2)
input.next.next = ListNode(3)
input.next.next.next = ListNode(4)
input.next.next.next.next = ListNode(5)
input.next.next.next.next.next = ListNode(6)
input.next.next.next.next.next.next = ListNode(7)
input.next.next.next.next.next.next.next = ListNode(8)

if __name__ == '__main__':
    s = Solution()
    print(s.oddEvenList(input))
