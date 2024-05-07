class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class doubling {
    public ListNode doubling(ListNode head) {
        ListNode curr = head;
        int carry = 0;

        // Traverse the list and double each node's value
        while (curr != null) {
            int newVal = curr.val * 2 + carry;
            curr.val = newVal % 10;
            carry = newVal / 10;
            if (curr.next == null && carry > 0) {
                curr.next = new ListNode(carry);
                carry = 0;
            }
            curr = curr.next;
        }

        return head;
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       doubling solution = new doubling();

        // Test cases
        // Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(8);
        head1.next.next = new ListNode(9);
        ListNode result1 = solution.doubling(head1);
        solution.printList(result1); // Output: 3 7 8

     
    }
}
