package cn.leetcode.java;

/**
 * @desc : https://leetcode-cn.com/problems/reverse-linked-list/
 * @author : cm
 * @createTime : 2020-7-3 10:15:22
 * @version : v1.0
 */
public class _206_反转链表 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * @author : cm
     * @createTime : 2020-7-3 11:19:43
     * @desc : 递归
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * @author : cm
     * @createTime : 2020-7-3 11:20:38
     * @desc : 迭代
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }

}