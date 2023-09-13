package cn.leetcode.java;

import java.util.Stack;

/**
 * @desc : https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * @author : cm
 * @createTime : 2020-7-13 17:17:23
 * @version : v1.0
 */
public class _232_用栈实现队列 {

    /**
     * 思路：
     * 1、准备两个栈：inStack、outStack
     * 2、入队时，push到inStack中
     * 3、出队时，
     * 3.1如果outStack为空，将inStack中所有元素逐一弹出并且push到outStack中，然后从outStack中弹出栈顶元素；
     * 3.2如果outStack不为空，从outStack中弹出栈顶元素
     */


    private Stack<Integer> inStack;

    private Stack<Integer> outStack;

    /** Initialize your data structure here. */
    public _232_用栈实现队列() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        checkStackEmpty();
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        checkStackEmpty();
        return outStack.peek();
    }

    /**
     * @author : cm
     * @createTime : 2020-7-13 17:45:02
     * @desc : 挪动inStack中的数据至outStack中
     */
    public void checkStackEmpty() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() == outStack.isEmpty();
    }

}