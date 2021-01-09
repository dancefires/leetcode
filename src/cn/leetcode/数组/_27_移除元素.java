package cn.leetcode.数组;

/**
 * @author : everget
 * @version : v1.0
 * @desc : https://leetcode-cn.com/problems/remove-element
 * @since : 2021-01-08 16:00
 */
public class _27_移除元素 {

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(_27_移除元素.removeElement(array, 2));
    }

}