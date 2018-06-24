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

    public ListNode removeElementsRecur(ListNode head, int val, int depth) {
        String depthString = generateDepthString(depth);
        System.out.println(depthString);
        System.out.println("Call: remove " + val + " in " + head);
        if (head == null) {
            System.out.println(depthString);
            System.out.println("Return " + head);
            return null;
        }

        ListNode res = removeElementsRecur(head.next, val, depth + 1);
        System.out.println(depthString);
        System.out.println("After remove " + val + ": " + res);

        ListNode ret;
        if (head.val == val) {
            ret = res;
        } else {
            head.next = res;
            ret = head;
        }
        System.out.println(depthString);
        System.out.println("Return " + ret);
        return ret;
    }

    private String generateDepthString(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("--");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

//        ListNode res = (new _203RemoveLinkedListElements()).removeElements(head, 6);
//        System.out.println(res);
        ListNode res2 = (new _203RemoveLinkedListElements()).removeElementsRecur(head, 6, 0);
        System.out.println(res2);
    }
}
