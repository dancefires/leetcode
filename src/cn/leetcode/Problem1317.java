package cn.leetcode;

/**
 * 题目：
 * 「无零整数」是十进制表示中 不含任何 0 的正整数。
 * 给你一个整数 n，请你返回一个 由两个整数组成的列表 [A, B]，
 * 满足：
 * ·A 和 B 都是无零整数
 * ·A + B = n
 * 题目数据保证至少有一个有效的解决方案。
 * 如果存在多个有效解决方案，你可以返回其中任意一个。
 * 提示： 2 <= n <= 10^4
 */
public class Problem1317 {

    public static int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];
        for (int i = 1; i < n; i++) {
            if (check(i) && check(n - i)) {
                arr[0] = i;
                arr[1] = n - i;
                break;
            }
        }
        return arr;
    }

    public static boolean check(int k) {
        String ss = String.valueOf(k);
        for (int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);
            if (c == '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10000;
        System.out.println(getNoZeroIntegers(n)[0]);
        System.out.println(getNoZeroIntegers(n)[1]);
    }
}