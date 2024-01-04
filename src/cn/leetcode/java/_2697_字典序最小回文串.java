package cn.leetcode.java;

/**
 * @desc : https://leetcode.cn/problems/lexicographically-smallest-palindrome/description/
 * @author : cm
 * @createTime : 2023-12-13 16:27:45
 * @version : v1.0
 */
public class _2697_字典序最小回文串 {

    public static String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if (arr[left] < arr[right]) {
                arr[right] = arr[left];
            } else {
                arr[left] = arr[right];
            }
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s1 = "egcfe";
        String s2 = "abcd";
        String s3 = "seven";
        System.out.println(makeSmallestPalindrome(s1));
        System.out.println(makeSmallestPalindrome(s2));
        System.out.println(makeSmallestPalindrome(s3));
    }

}