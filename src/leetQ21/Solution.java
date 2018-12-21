package leetQ21;

import java.util.jar.JarEntry;

public class Solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        ListNode listNode = mergeTwoLists(node1, node4);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode temp = answer;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? Integer.MAX_VALUE : l1.val;
            int val2 = l2 == null ? Integer.MAX_VALUE : l2.val;
            int value;
            if (val2 > val1) {
                l1 = l1.next;
                value = val1;
            } else {
                l2 = l2.next;
                value = val2;
            }
            ListNode t = new ListNode(value);
            temp.next = t;
            temp = t;
        }

        return answer.next;
    }
}
