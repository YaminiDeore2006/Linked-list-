/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp = head ;
        
        if(head == null)
        {
            return null;
        }
        
        if(x == 1)
        {
           return head.next;
        }
        
        Node curr = null; 
        
        for(int i = 1 ; i < x ; i++)
        {
            curr = temp ;
            temp = curr.next ;
        }
        
        curr.next = temp.next ;
        return head ;
    }
}
