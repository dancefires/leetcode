package cn.leetcode._26;

/*
题目：
给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

示例 1:
给定数组 nums = [1,1,2],
函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
你不需要考虑数组中超出新长度后面的元素。
 */

//(结论：超时)
public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates remove = new RemoveDuplicates();
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

    public void changeArray(int[] nums, int position) {
        for (int i = position; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
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

}