package cn.leetcode.java;

/**
 * @author : cm
 * @version : v1.0
 * @desc : https://leetcode.cn/problems/search-insert-position/
 * @createTime : 2023-07-19 10:46:24
 */
public class _35_搜索插入位置 {

    // 基础版，数组中不能有重复数据
    public int search1(int[] nums, int target) {
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
        return low;  // target not found.
    }

    // 进阶版，数组中可以有重复数据
    public int search2(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = nums[mid];

            if (midVal < target) {
                low = mid + 1;
            } else if (midVal >= target) {
                high = mid - 1;
            }
        }
        return low;  // target not found.
    }

}