#https://www.youtube.com/watch?v=7VYwHt1WfQs
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def add_node(self, node): #add a new node to the end of the list
        if not self:  #if it is empty then just add it at the beginning of the list (head) and return head
            return ListNode(node)

        current = self #start from head and go through each item until you find last one (tail) and append a new node after that tail

        while current.next:  #go through each item until you find last one (tail) and append a new node after that tail
            current = current.next

        current.next = ListNode(node)  #append a new node after that tail

    def print_list(self):  #print all items in linked list starting from head to tail using recursion approach by going down to next pointer till we reach null pointer or end of list
        if not self:  #if there is no element in linked list then return nothing as string so we can use "print" function on this string which will print nothing instead of printing error message like "NoneType object has no attribute 'val'" for empty linked lists or other errors like "ValueError('invalid literal for int() with base 10: '')" when trying to convert an empty string into integer value like below code snippet : int("") == 0 but should be 1 because "" is also considered as valid input for integer data type conversion so we have to check first before converting into integer value otherwise program will throw error saying invalid literal for int() with base 10:"""   """   """   """   """   """   """   """     try:         result = str(int(input("Enter number :"))).strip()     except ValueError as e:         print("Invalid input! Please enter numbers only.")         exit(-1)     else:#convert given input into integer value          result=int(result)      if result==0:#check whether given input was zero or not          print("Empty LinkedList!")          exit(-1)      elif result>0:#check whether given input was positive number or not       n=result-1       while n>0:#loop till user
