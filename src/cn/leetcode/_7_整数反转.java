package cn.leetcode;

/**
 * @desc : https://leetcode-cn.com/problems/reverse-integer/
 * @author : cm
 * @createTime : 2020-7-2 16:35:52
 * @version : v1.0
 */
public class _7_整数反转 {

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1463847412)); // 2147483641
        System.out.println(reverse(123));
        System.out.println(reverse(120));
        System.out.println(reverse(-123));
        System.out.println(reverse(100));
    }

}