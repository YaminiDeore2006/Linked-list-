if (llist == null) {
        return null;
    }

    // Case 2: Delete head node (position 0)
    if (position == 0) {
        return llist.next;
    }

    // Case 3: Traverse to node before the position
    SinglyLinkedListNode current = llist;

    for (int i = 0; i < position - 1; i++) {
        current = current.next;
    }

    // Delete node by skipping it
    if (current.next != null) {
        current.next = current.next.next;
    }

    return llist;
