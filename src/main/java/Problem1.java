// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(l1.val);
        ListNode current_src = l1;
        ListNode current_dest = result;
        while(current_src.next != null) {
            current_dest.next = new ListNode(current_src.val);
            current_src = current_src.next;
            current_dest = current_dest.next;
        }
        current_src = l2;
        while(current_src.next != null) {
            current_dest.next = new ListNode(current_src.val);
            current_src = current_src.next;
            current_dest = current_dest.next;
        }
        return result;
    }
}
