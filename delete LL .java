// JavaScript program to delete a linked list

class Node {
    constructor(x) {
        this.data = x;
        this.next = null;
    }
}

// Create a hard-coded linked list:
// 1 -> 2 -> 3 -> 4 -> 5
let head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
head.next.next.next = new Node(4);
head.next.next.next.next = new Node(5);

// Set head to null to remove the reference to the linked list.
// This allows JavaScript's garbage collector to automatically reclaim
// the memory used by the nodes, as there are no more references
// to the nodes in the linked list.
head = null;
console.log("NULL");
