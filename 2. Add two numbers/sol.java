public class sol {

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null) {
            return list2;
        } else {
            return list1;
        }
    }
  

    public static void main(String[] args) {
        sol Sol = new sol();
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(4);
        list1.next = list2;
        list2.next = list3;

        ListNode list11 = new ListNode(1);
        ListNode list21 = new ListNode(3);
        ListNode list31 = new ListNode(4);
        list11.next = list21;
        list21.next = list31;

        ListNode head = Sol.mergeTwoLists(list1, list11);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
