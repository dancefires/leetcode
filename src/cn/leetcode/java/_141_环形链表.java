package cn.leetcode.java;

/**
 * @desc : https://leetcode.cn/problems/linked-list-cycle/
 * @author : cm
 * @createTime : 2020-7-2 16:51:01
 * @version : v1.0
 */
public class _141_环形链表 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

}