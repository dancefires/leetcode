package cn.leetcode.java;

/**
 * @desc : https://leetcode-cn.com/problems/fibonacci-number/
 * @author : cm
 * @createTime : 2020-7-2 16:37:36
 * @version : v1.0
 */
public class _509_斐波那契数 {

    public int fib(int N) {
        if (N <= 1) {
            return N;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < N - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

}