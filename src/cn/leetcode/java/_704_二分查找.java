package cn.leetcode.java;

/**
 * @author : cm
 * @version : v1.0
 * @desc : https://leetcode.cn/problems/binary-search/
 * @createTime : 2023-07-19 10:46:24
 */
public class _704_二分查找 {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = nums[mid];

            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                return mid; // target found
            }
        }
        return -1;  // target not found.
    }

}