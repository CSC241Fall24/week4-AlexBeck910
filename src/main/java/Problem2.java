public class Problem2 {

    public static ListNode insert(ListNode head, int val, int position) {
        if (position == 0) {
            ListNode newNode = head;
            newNode.value = val;
            return newNode;
        }
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode current = head;
        for (int i = 0; i < position; i++) {
            if (current.next == null) {
                current.next = new ListNode(val);
                return head;
            }

            current = current.next;
        }
        ListNode previous_next = current.next;
        ListNode new_next = new ListNode(val);
        new_next.next = previous_next;
        current.next = new_next;
        return head;
    }
}
