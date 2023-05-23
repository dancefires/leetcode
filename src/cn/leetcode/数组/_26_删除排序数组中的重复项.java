package cn.leetcode.数组;

/**
 * @desc : https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * @author : cm
 * @createTime : 2020-7-2 16:38:51
 * @version : v1.0
 */
//(结论：超时)
public class _26_删除排序数组中的重复项 {

    public void changeArray(int[] nums, int position) {
        if (nums.length - 1 - position >= 0) {
            System.arraycopy(nums, position + 1, nums, position, nums.length - 1 - position);
        }
    }

    public int removeDuplicates(int[] nums) {
        int size = 0;
        if (nums == null || nums.length == 0) {
            size = 0;
        } else {
            size = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                int temp = i;
                for (int j = i; j < nums.length - 1; j++) {
                    if (nums[i] == nums[temp + 1]) {
                        changeArray(nums, i);
                    } else {
                        temp++;
                    }
                }
            }
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == size) {
                    size = k + 1;
                    break;
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        _26_删除排序数组中的重复项 remove = new _26_删除排序数组中的重复项();
        int[] nums = {0, 1, 1, 1, 2, 3};
        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = remove.removeDuplicates(nums);
        System.out.println("len=" + len);
        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

}