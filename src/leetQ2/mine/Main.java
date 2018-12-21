package leetQ2.mine;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        ListNode nodeX = new ListNode(7);
        ListNode nodeY = new ListNode(8);
        ListNode nodeZ = new ListNode(9);
        nodeX.next = nodeY;
        nodeY.next = nodeZ;
        ListNode listNode = addTwoNumbers(node1, nodeX);
        for (ListNode node = listNode; node != null; node = node.next) {
            System.out.println(node.val);
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ansNode = null;
        ArrayList<Integer> ansInt = new ArrayList<>();
        int j = 0;
        while (true) {
            if (l1.next == null || l2.next == null) {
                break;
            }
            if (l1.val + l2.val > 9) {
                if (j == 0) {
                    ansInt.add(1);
                    ansInt.add(l1.val + l2.val - 10);
                    j++;
                    j++;
                } else {
                    ansInt.set(j - 1, ansInt.get(j - 1) + 1);
                    ansInt.add(l1.val + l2.val - 10);
                    j++;
                }
            } else {
                ansInt.add(l1.val + l2.val);
                j++;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        ansNode = new ListNode(ansInt.get(0));
        System.out.println(ansInt.size());
        for (int i = 1; i < ansInt.size(); i++) {
            ListNode node = new ListNode(ansInt.get(i));
            ansNode.next = node;
            ansNode = node;
        }
        return ansNode;
    }
}

