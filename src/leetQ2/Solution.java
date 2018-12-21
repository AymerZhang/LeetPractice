package leetQ2;

public class Solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        ListNode listNode = addTwoNumbers(node1, node4);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fake = new ListNode(0);
        ListNode t=fake, t1=l1, t2=l2;
        int a1, a2, r = 0;
        while (t1!=null || t2!=null || r!=0) {
            a1 = t1==null ? 0:t1.val;
            a2 = t2==null ? 0:t2.val;
            r += a1 + a2;
            t.next = new ListNode(r%10);
            r /= 10;
            t = t.next;
            if (t1!=null) t1 = t1.next;
            if (t2!=null) t2 = t2.next;
        }
        return fake.next;
    }

}
