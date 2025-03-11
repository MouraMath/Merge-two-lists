package github.mouramath;


import github.mouramath.model.ListNode;
import github.mouramath.solution.ListMergeSolution;
import github.mouramath.util.LinkedListUtil;


public class Main {
    public static void main(String[] args) {

        int[] values1 = {1, 2, 4};
        int[] values2 = {1, 3, 4};

        ListNode list1 = LinkedListUtil.createLinkedList(values1);
        ListNode list2 = LinkedListUtil.createLinkedList(values2);

        System.out.println("Lista 1:");
        LinkedListUtil.printList(list1);

        System.out.println("Lista 2:");
        LinkedListUtil.printList(list2);


        ListMergeSolution solution = new ListMergeSolution();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        System.out.println("Lista mesclada:");
        LinkedListUtil.printList(mergedList);
    }
}
