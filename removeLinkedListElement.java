
// Definition for singly-linked list.
// public class ListNode {
//     int val;
//     ListNode next;

//     ListNode(int x) {
//         val = x;
//     }
// }

public class removeLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        else {
            if (head.val == val)
                return removeElements(head.next, val);
            else {
                head.next = removeElements(head.next, val);
                return head;
            }
        }

    }

}