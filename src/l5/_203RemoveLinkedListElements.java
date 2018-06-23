package l5;


public class _203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }

    public ListNode removeElementsRecur(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeElementsRecur(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new _203RemoveLinkedListElements()).removeElements(head, 6);
        System.out.println(res);
        ListNode res2 = (new _203RemoveLinkedListElements()).removeElementsRecur(head, 6);
        System.out.println(res2);
    }
}
