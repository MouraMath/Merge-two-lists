package github.mouramath.solution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import github.mouramath.model.ListNode;
import github.mouramath.util.LinkedListUtil;


public class ListMergeSolutionTest {

    private final ListMergeSolution solution = new ListMergeSolution();

    @Test
    public void testMergeTwoLists_BothNonEmpty() {
        ListNode list1 = LinkedListUtil.createLinkedList(new int[]{1, 2, 4});
        ListNode list2 = LinkedListUtil.createLinkedList(new int[]{1, 3, 4});

        ListNode result = solution.mergeTwoLists(list1, list2);

        // Verificando se o resultado é 1->1->2->3->4->4
        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
        assertNull(result.next.next.next.next.next.next);
    }

    @Test
    public void testMergeTwoLists_OneEmpty() {
        ListNode list1 = LinkedListUtil.createLinkedList(new int[]{1, 2, 3});
        ListNode list2 = null;

        ListNode result = solution.mergeTwoLists(list1, list2);

        // Verificando se o resultado é igual a list1
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testMergeTwoLists_BothEmpty() {
        ListNode list1 = null;
        ListNode list2 = null;

        ListNode result = solution.mergeTwoLists(list1, list2);

        // Verificando se o resultado é null
        assertNull(result);
    }
}