package github.mouramath.util;

import github.mouramath.model.ListNode;

public class LinkedListUtil {


    public static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }


    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("Lista vazia");
            return;
        }

        StringBuilder sb = new StringBuilder();
        ListNode current = head;

        while (current != null) {
            sb.append(current.val);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }

        System.out.println(sb.toString());
    }
}