/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        int count = 1;
        Node curr = head;
        
        while(curr != null) {
            if(count == index) {
                return curr.data;
            }
            curr = curr.next;
            count++;
        }
        
        return -1; // index not found
    }
}
