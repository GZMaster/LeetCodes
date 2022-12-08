# Definition for singly-linked list.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next



class Solution:
    def middleNode(self, head: ListNode) -> ListNode:
        slowCount = head
        fastCount = head
        
        if head == None:
            return None
        
        while (fastCount != None and fastCount.next != None):
            slowCount = slowCount.next
            if fastCount.next.next == None:
                return slowCount
            else:
                fastCount = fastCount.next.next
        return slowCount
        


if __name__ == '__main__':
    s = Solution()
    print(s.middleNode())