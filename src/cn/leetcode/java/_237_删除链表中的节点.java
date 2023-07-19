package cn.leetcode.java;

/**
 * @desc : https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @author : cm
 * @createTime : 2020-7-2 16:25:05
 * @version : v1.0
 */
public class _237_删除链表中的节点 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}