package cn.leetcode.java;

import java.util.HashMap;
import java.util.Stack;

/**
 * @desc : https://leetcode-cn.com/problems/valid-parentheses/
 * @author : cm
 * @createTime : 2020-7-2 16:30:39
 * @version : v1.0
 */
public class _20_有效的括号 {

    /**
     * 思路：
     * 1、遇见左字符，将左字符入栈；
     * 2、遇见右字符
     * 2.1如果栈是空的，说明括号无效
     * 2.2如果栈不为空，将栈顶字符出栈，与右字符匹配（匹配方式：借助HashMap key与value 相对应方法）
     * 2.2.1如果左右字符不匹配，说明括号无效
     * 2.2.2如果左右字符匹配，继续扫描下一个字符
     * 3、所有字符扫描完成后
     * 3.1栈为空，说明括号有效
     * 3.2栈不为空，说明括号无效
     */

    // Hash table that takes care of the mappings.
    private final HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public _20_有效的括号() {
        // 注意闭括号作为key，开括号作为value
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        // ①初始化栈 S
        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // ③如果当前的字符是闭括号
            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // ④如果遇到闭括号，那么检查栈顶的元素。
                // 如果栈顶的元素是一个 相同类型的 左括号，那么将它从栈中弹出并继续处理。
                // 否则，这意味着表达式无效。
                // 插入'#'号步骤的意义是如果所有字符都是闭括号，这样会导致没有字符被压入栈中，影响最后栈是否为空的判断。
                // Get the top element of the stack. If the stack is empty, set a dummy value of
                // '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return
                // false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // ②如果当前的字符是开括号
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // ⑤如果栈里还有字符，说明是不合法的表达式
        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        _20_有效的括号 problem20 = new _20_有效的括号();
        System.out.println(problem20.isValid(s));
    }

}