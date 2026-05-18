/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node slow = head ;
        Node fast = head ;
        int size = 0 ;
        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next;
            
            if(slow == fast)
            {
                Node ptr1 = head ;
                Node ptr2 = slow ;
                
                while(ptr1 != ptr2)
                {
                    ptr1 = ptr1.next ;
                    ptr2 = ptr2.next ;
                }
                ptr1 = ptr1.next ;
                size++ ;
                while(ptr1 != ptr2)
                {
                    ptr1 = ptr1.next ;
                    size++;
                }
                return size ;
            }
        }
        return 0 ;
    }
}
