package cn.leetcode.链表;

/**
 * @desc : https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @author : cm
 * @createTime : 2020-7-2 16:51:01
 * @version : v1.0
 */
public class _203_移除链表元素 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * @author : cm
     * @createTime : 2020-7-13 10:48:59
     * @desc : 递归实现
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements1(head.next, val);
        return head.val == val ? head.next : head;
    }

    /**
     * @author : cm
     * @createTime : 2020-7-13 10:49:13
     * @desc : 创建伪头结点，双指针形式
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements2(ListNode head, int val) {
        //创建一个哨兵节点，指向head节点
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        //创建prev和curr指针分别指向哨兵节点和head节点
        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) {
                //如果val相等，则删除节点
                prev.next = curr.next;
            } else {
                //如果val不相等，则让prev往前走
                prev = curr;
            }
            //每次循环，curr都往前走
            curr = curr.next;
        }
        //返回哨兵节点的next节点即为头结点
        return sentinel.next;
    }

    /**
     * @author : cm
     * @createTime : 2020-7-13 10:49:13
     * @desc : 创建伪头结点，单指针形式
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements3(ListNode head, int val) {
        //创建头结点
        ListNode temp = new ListNode(0);
        //头结点指向head
        temp.next = head;
        //创建游标，指向temp
        ListNode pre = temp;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return temp.next;
    }

}