// Problem: Detect Loop in Linked List
// Author: Ataul (codeByunique)

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class DetectLoop {
    public static void main(String[] args) {
        // Create Linked List: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating loop: 5 → 3
        head.next.next.next.next.next = head.next.next;

        System.out.println("Contains Loop? " + hasCycle(head));
    }

    // Floyd’s Cycle Detection Algorithm
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }

        return false;
    }
}
