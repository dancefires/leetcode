package cn.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * 题目：
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 */
public class Problem20 {

    // Hash table that takes care of the mappings.
    private final HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Problem20() {
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
        Problem20 problem20 = new Problem20();
        System.out.println(problem20.isValid(s));
    }

}