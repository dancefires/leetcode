package cn.leetcode.java;

/**
 * @desc : https://leetcode-cn.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 * @author : cm
 * @createTime : 2020-7-2 16:27:45
 * @version : v1.0
 */
public class _1317_将整数转换为两个无零整数的和 {

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